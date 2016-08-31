package com.ysr.jsonmysqldemo;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.Gson;
import com.ysr.jsonmysqldemo.beans.DateBean;
import com.ysr.jsonmysqldemo.beans.NewsBean;
import com.ysr.jsonmysqldemo.db.MySqlitehelper;
import com.ysr.jsonmysqldemo.utils.NewsResult;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private final String DB_NAME = "mynews.db";
    private final String Db_path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/jsonSqlite/" + DB_NAME;
    private Button btnSave, btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSave = (Button) findViewById(R.id.btnSave);

        btnShow = (Button) findViewById(R.id.btnShow);

        if (booleanAssets(Db_path) == false) {
            Log.e("JSONArray", "数据库不存在");
            copyAssets(MainActivity.this, DB_NAME, Db_path);
        }
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                test(Db_path);
            }
        });

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<NewsBean.V9LG4B3A0Bean> lse = getshowDate(Db_path);
                for (int i = 0; i <lse.size(); i++) {
                    Log.e("Description","lse.size="+lse.size()+";Description>>>"+ lse.get(i).description);
                }
            }
        });
    }

    private void test(String path) {
        /**
         * json方式
         */
//        JSONObject result = JSONObject.parseObject(NewsResult.result);
//        JSONArray body = result.getJSONArray("V9LG4B3A0");
//        for (int i = 0; i < body.size(); i++) {
//            JSONObject jsonObj = (JSONObject) body.get(i);
//            String name = jsonObj.getString("mp4_url");
//            Log.e("JSONArray", "name>>" + name);
//        }
        /**
         * gson方式
         */
        NewsBean newsbean = new Gson().fromJson(NewsResult.result, NewsBean.class);
        // TODO: 2015/12/13 获取系统时间
        SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SQLiteDatabase writableDatabase = SQLiteDatabase.openOrCreateDatabase(path, null);
        writableDatabase.delete(MySqlitehelper.Table_Name, null, null);
        String pe = "insert into " + MySqlitehelper.Table_Name +
                "(topicImg,videosource,mp4Hd_url,topicDesc," +
                "topicSid,cover,title,playCount," +
                "replyBoard,topicName,ptime,m3u8_url,length" + ")values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        for (int i = 0; i < newsbean.V9LG4B3A0.size(); i++) {
            String[] parms = null;
            parms = new String[]{newsbean.V9LG4B3A0.get(i).topicImg, newsbean.V9LG4B3A0.get(i).videosource,
                    newsbean.V9LG4B3A0.get(i).mp4Hd_url, newsbean.V9LG4B3A0.get(i).topicDesc,
                    newsbean.V9LG4B3A0.get(i).topicSid, newsbean.V9LG4B3A0.get(i).cover,
                    newsbean.V9LG4B3A0.get(i).title, newsbean.V9LG4B3A0.get(i).playCount + "",
                    newsbean.V9LG4B3A0.get(i).replyBoard, newsbean.V9LG4B3A0.get(i).topicName
                    , newsbean.V9LG4B3A0.get(i).ptime, newsbean.V9LG4B3A0.get(i).m3u8_url,
                    newsbean.V9LG4B3A0.get(i).length + ""};
            //插入

            writableDatabase.execSQL(pe, parms);
        }
        writableDatabase.close();
//        ContentValues value = new ContentValues();
//        value.put("topicImg", newsbean.V9LG4B3A0.get(1).topicName);
//        value.put("videosource", newsbean.V9LG4B3A0.get(1).topicName);
//        value.put("mp4Hd_url", newsbean.V9LG4B3A0.get(1).topicName);
//        //MySqlitehelper mySqlitehelper = new MySqlitehelper(MainActivity.this);
//        //SQLiteDatabase writableDatabase = mySqlitehelper.getWritableDatabase();
//        writableDatabase.insert(MySqlitehelper.Table_Name, null, value);
//        writableDatabase.close();
//        mySqlitehelper.close();
//        Cursor cursor = database.query(MySqlitehelper.Table_Name, null, null, null, null, null, null, null);
//        if (cursor.moveToFirst()) {
//            String login_id = cursor.getString(cursor.getColumnIndex("topicImg"));
//            if (login_id.equals("")) {
//            } else {
//                Log.e("JSONArray", "topicImg>>>>>" + login_id);
//            }
//        }
//        cursor.close();
//        database.close();
    }


    /**
     * 获取数据库数据
     * @return
     */
    private List<DateBean> showList;
    SQLiteDatabase writableDatabase=null;
    public synchronized List getshowDate(String path) {
        writableDatabase = SQLiteDatabase.openOrCreateDatabase(path, null);
        Cursor cursor = writableDatabase.query(MySqlitehelper.Table_Name, null, null, null, null, null, null, null);
        Cursor queryCursor = null;
        try {
            if (cursor.getCount() > 0) {
                int limitNum;
                if (cursor.getCount() <= 30) limitNum = cursor.getCount();
                else limitNum = cursor.getCount() - (cursor.getCount() - 30);
                //select * from 表名 limit 0,10;
                String sql = "select * from " + MySqlitehelper.Table_Name + " limit " + 0 + "," + limitNum;
                queryCursor = writableDatabase.rawQuery(sql, null);
                showList = new ArrayList<DateBean>();
                while (queryCursor.moveToNext()) {
                    String topicImg = queryCursor.getString(queryCursor.getColumnIndex("topicImg"));
                    String videosource = queryCursor.getString(queryCursor.getColumnIndex("videosource"));
                    String mp4Hd_url = queryCursor.getString(queryCursor.getColumnIndex("mp4Hd_url"));
                    String topicDesc = queryCursor.getString(queryCursor.getColumnIndex("topicDesc"));
                    String topicSid = queryCursor.getString(queryCursor.getColumnIndex("topicSid"));
                    String cover = queryCursor.getString(queryCursor.getColumnIndex("cover"));
                    String title = queryCursor.getString(queryCursor.getColumnIndex("title"));
                    String playCount = queryCursor.getString(queryCursor.getColumnIndex("playCount"));
                    String replyBoard = queryCursor.getString(cursor.getColumnIndex("replyBoard"));
                    String topicName = queryCursor.getString(cursor.getColumnIndex("topicName"));
                    String ptime = queryCursor.getString(cursor.getColumnIndex("ptime"));
                    String m3u8_url = queryCursor.getString(cursor.getColumnIndex("m3u8_url"));
                    String length = queryCursor.getString(cursor.getColumnIndex("length"));
                    showList.add(new DateBean(topicImg, videosource, mp4Hd_url, topicDesc, topicSid, cover, title, playCount, replyBoard, topicName, ptime, m3u8_url, length));
                }
                return showList;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != queryCursor)
                queryCursor.close();
            cursor.close();
        }

        return null;
    }

    /**
     * 判断文件是否存在
     *
     * @param path
     * @return
     */
    public boolean booleanAssets(String path) {
        File fis = new File(path);
        if (fis.exists()) {
            Log.e("JSONArray", "数据库存在");
            return true;
        }
        return false;
    }

    /**
     * 复制文件到本地
     *
     * @param context
     * @param fileName
     * @param path
     */
    public void copyAssets(Context context, String fileName,
                           String path) {
        try {
            // 首先判断该目录下的文件夹是否存在
            File dir = new File(Environment.getExternalStorageDirectory()
                    + "/jsonSqlite/");
            if (!dir.exists()) {
                // 文件夹不存在 ， 则创建文件夹
                dir.mkdirs();
                Toast.makeText(getApplication(), "创建文件夹", Toast.LENGTH_SHORT)
                        .show();
            }
            InputStream is = context.getAssets().open(fileName);
            File file = new File(path);
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            byte[] temp = new byte[1024];
            int i = 0;
            while ((i = is.read(temp)) > 0) {
                fos.write(temp, 0, i);
            }
            fos.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
