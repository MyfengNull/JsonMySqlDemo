package com.ysr.jsonmysqldemo.beans;

import java.util.List;

/**
 * Created by Administrator on 2016/8/31.
 */
public class XjxcBean {

    public BodyBean body;
    /**
     * rtnCode : 0
     * rtnMsg : 请求成功
     */

    public HeadBean head;

    public BodyBean getBody() {
        return body;
    }

    public void setBody(BodyBean body) {
        this.body = body;
    }

    public HeadBean getHead() {
        return head;
    }

    public void setHead(HeadBean head) {
        this.head = head;
    }

    public static class BodyBean {
        /**
         * tasknum : 沈Z201605
         * twotaskdata : [{"devicetype1data":[],"originid":"沈06-02009","projectaddress":"沈阳市铁西区兴顺街6号","projectdocid":"2c9198375528f5f7015528f5fb5d000e","taskid":"2c93809156271083015627187f5300a7","tasktype":"0"},{"devicetype1data":[],"originid":"沈06-02003","projectaddress":"沈阳市铁西区颂工街4号","projectdocid":"2c9198375528f5f7015528f5fc940012","taskid":"2c93809156271083015627187e810073","tasktype":"0"},{"devicetype1data":[],"originid":"沈06-02007","projectaddress":"沈阳市铁西区北三东路9号","projectdocid":"2c9198375528f5f7015528f5fb34000c","taskid":"2c93809156271083015627187fba00c1","tasktype":"0"},{"devicetype1data":[],"originid":"沈06-02006","projectaddress":"沈阳市铁西区兴华南街37号","projectdocid":"2c9198375528f5f7015528f5fc250010","taskid":"2c93809156271083015627187eed008d","tasktype":"0"}]
         */

        public List<DeviceTaskBean> deviceTask;
        /**
         * tasknum : 沈Z201605
         * twotaskdata : [{"originid":"沈06-02009","problems":[{"checked":false,"measures":[{"measureid":"40288aff3f5b99a4013f5ee14a2e0007","measurename":"停止使用，按规定补办人防工程使用行政许可手续。"},{"measureid":"40288aff3f7374c8013f73b29c9f000f","measurename":"健全安全使用管理制度、措施、预案。"},{"measureid":"4028e4ff415e86a901415eb37e780015","measurename":"按规定张贴疏散示意图。"}],"problemid":"40288aff3f5f2dc3013f5f2e0eb60002","problemname":"未办理《人防工程使用证》，擅自使用。"},{"checked":false,"measures":[{"measureid":"40288aff3f7374c8013f73b29c9f000f","measurename":"健全安全使用管理制度、措施、预案。"}],"problemid":"40288aff3f7374c8013f73b1f652000e","problemname":"未建立安全使用管理制度、措施、预案。"},{"checked":false,"measures":[{"measureid":"40288aff3f5b99a4013f5b9fb2cd0005","measurename":"暂扣《人防工程使用证》，须按原批准用途使用。"}],"problemid":"40288aff3f7374c8013f73b1cb1d000d","problemname":"未按《人防工程使用证》批准用途使用。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb37e780015","measurename":"按规定张贴疏散示意图。"}],"problemid":"4028e4ff415e86a901415eb355e20014","problemname":"未按规定张贴疏散示意图。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb82c2a002c","measurename":"改善内部环境，保持干净、整洁。"}],"problemid":"4028e4ff415e86a901415eb88f39002d","problemname":"内部环境脏、乱、差。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb754480026","measurename":"规范设置电气线路、电源、开关、灯具。"}],"problemid":"4028e4ff415e86a901415ebb0b550039","problemname":"电气线路、电源、开关、灯具设置不规范。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb77ccf0027","measurename":"规范码放货物，杜绝人货混居。"}],"problemid":"4028e4ff415e86a901415eba7dbb0037","problemname":"货物码放不规范，人货混居"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb614e20021","measurename":"清除热得快、电炉子、电褥子、红外加热炉、油浸电气设备、大功率电器。"}],"problemid":"4028e4ff415e86a901415ebd089c0043","problemname":"使用热得快、电炉子、电褥子、红外加热炉、油浸电气设备，在住人房间内使用大功率电器。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb583be001e","measurename":"规范设置灭火器。"}],"problemid":"4028e4ff415e86a901415ebe290f0049","problemname":"灭火器数量不足或过期失效"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb4ad34001a","measurename":"规范设置机械通风系统或者空气调节装置。"}],"problemid":"4028e4ff415e86a901415ebf85060050","problemname":"未按规定设置机械通风系统或空气调节装置。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb50ac5001c","measurename":"清出超标人员"},{"measureid":"4028e4ff415e86a901415eb7e79f002a","measurename":"清出设备间内物品和人员。"}],"problemid":"4028e4ff415e86a901415eb96d060031","problemname":"人防设备间内堆物或住人。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb7c12b0029","measurename":"停止改造行为，按规定补办人防工程改造行政许可手续。"}],"problemid":"4028e4ff415e86a901415eb9bb360033","problemname":"擅自改造"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb718770025","measurename":"禁止在设有独立排风系统的吸烟室外吸烟。"}],"problemid":"4028e4ff415e86a901415ebb4e97003b","problemname":"住人、办公、娱乐、健身、库房等房间内吸烟。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb583be001e","measurename":"规范设置灭火器。"}],"problemid":"4028e4ff415e86a901415ebbb5ae003d","problemname":"在库房内使用电烙铁、电熨斗等电热器具和电视机、电冰箱等电器设备。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb6b1030023","measurename":"清除油漆、56度以上白酒、酒精、液化石油气钢瓶、可燃式机油、丁烷、香水、打火机、火柴、发胶、烟花爆竹等易燃易爆物品。"}],"problemid":"4028e4ff415e86a901415ebc5327003f","problemname":"储存或使用油漆、56度以上白酒、酒精、液化石油气钢瓶、可燃式机油、丁烷、香水、打火机、火柴、发胶、烟花爆竹等易燃易爆物品"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb4ad34001a","measurename":"规范设置机械通风系统或者空气调节装置。"}],"problemid":"4028e4ff415e86a901415ebda6140047","problemname":"疏散指示标志或应急照明设施设置不规范或数量不足"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb54ba7001d","measurename":"规范设置简易（自动）喷水灭火系统。"}],"problemid":"4028e4ff415e86a901415ebe67ed004b","problemname":"未设置自动（简易）喷水灭火系统。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb50ac5001c","measurename":"清出超标人员"}],"problemid":"4028e4ff415e86a901415ebf406b004d","problemname":"设置上下床，通铺，居住人员超标"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb4176c0018","measurename":"每日详实记录巡查情况"}],"problemid":"4028e4ff415e86a901415ebfdc8c0052","problemname":"未建立健全居住人员、人员来访、车辆进出、货物进出登记。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb3a4cd0016","measurename":"备齐有关防汛物资。"}],"problemid":"4028e4ff415e86a901415ec05de10057","problemname":"不具备防汛、防雨水倒灌设施。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb80b15002b","measurename":"定期对人防设备进行维护，更换损坏的设备设施。"}],"problemid":"4028e4ff415e86a901415eb91d60002f","problemname":"未按规定维护、维修人防设备设施。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb79da50028","measurename":"停止破坏行为。"}],"problemid":"4028e4ff415e86a901415eba17ec0035","problemname":"破坏结构、破坏防护设备设施"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb650360022","measurename":"清除液化石油气、煤、汽油等明火以及其他产生有害气体的燃烧器。"}],"problemid":"4028e4ff415e86a901415ebcacb00041","problemname":"用液化石油气、煤、汽油等明火以及其他产生有害气体的燃烧器"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb5c6b30020","measurename":"确保安全出口、疏散通道畅通。"}],"problemid":"4028e4ff415e86a901415ebd59f80045","problemname":"安全出口封堵、疏散通道堆放杂物"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb403580017","measurename":"配备值班人员"}],"problemid":"4028e4ff415e86a901415ec02ef20054","problemname":"无值班人员、未每日进行巡查记录"}],"projectaddress":"沈阳市铁西区兴顺街6号","projectdocid":"2c9198375528f5f7015528f5fb5d000e","taskid":"2c93809156271083015627187f5300a7","tasktype":"0"},{"originid":"沈06-02003","problems":[{"checked":false,"measures":[{"measureid":"40288aff3f5b99a4013f5ee14a2e0007","measurename":"停止使用，按规定补办人防工程使用行政许可手续。"},{"measureid":"40288aff3f7374c8013f73b29c9f000f","measurename":"健全安全使用管理制度、措施、预案。"},{"measureid":"4028e4ff415e86a901415eb37e780015","measurename":"按规定张贴疏散示意图。"}],"problemid":"40288aff3f5f2dc3013f5f2e0eb60002","problemname":"未办理《人防工程使用证》，擅自使用。"},{"checked":false,"measures":[{"measureid":"40288aff3f7374c8013f73b29c9f000f","measurename":"健全安全使用管理制度、措施、预案。"}],"problemid":"40288aff3f7374c8013f73b1f652000e","problemname":"未建立安全使用管理制度、措施、预案。"},{"checked":false,"measures":[{"measureid":"40288aff3f5b99a4013f5b9fb2cd0005","measurename":"暂扣《人防工程使用证》，须按原批准用途使用。"}],"problemid":"40288aff3f7374c8013f73b1cb1d000d","problemname":"未按《人防工程使用证》批准用途使用。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb37e780015","measurename":"按规定张贴疏散示意图。"}],"problemid":"4028e4ff415e86a901415eb355e20014","problemname":"未按规定张贴疏散示意图。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb82c2a002c","measurename":"改善内部环境，保持干净、整洁。"}],"problemid":"4028e4ff415e86a901415eb88f39002d","problemname":"内部环境脏、乱、差。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb754480026","measurename":"规范设置电气线路、电源、开关、灯具。"}],"problemid":"4028e4ff415e86a901415ebb0b550039","problemname":"电气线路、电源、开关、灯具设置不规范。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb77ccf0027","measurename":"规范码放货物，杜绝人货混居。"}],"problemid":"4028e4ff415e86a901415eba7dbb0037","problemname":"货物码放不规范，人货混居"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb614e20021","measurename":"清除热得快、电炉子、电褥子、红外加热炉、油浸电气设备、大功率电器。"}],"problemid":"4028e4ff415e86a901415ebd089c0043","problemname":"使用热得快、电炉子、电褥子、红外加热炉、油浸电气设备，在住人房间内使用大功率电器。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb583be001e","measurename":"规范设置灭火器。"}],"problemid":"4028e4ff415e86a901415ebe290f0049","problemname":"灭火器数量不足或过期失效"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb4ad34001a","measurename":"规范设置机械通风系统或者空气调节装置。"}],"problemid":"4028e4ff415e86a901415ebf85060050","problemname":"未按规定设置机械通风系统或空气调节装置。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb50ac5001c","measurename":"清出超标人员"},{"measureid":"4028e4ff415e86a901415eb7e79f002a","measurename":"清出设备间内物品和人员。"}],"problemid":"4028e4ff415e86a901415eb96d060031","problemname":"人防设备间内堆物或住人。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb7c12b0029","measurename":"停止改造行为，按规定补办人防工程改造行政许可手续。"}],"problemid":"4028e4ff415e86a901415eb9bb360033","problemname":"擅自改造"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb718770025","measurename":"禁止在设有独立排风系统的吸烟室外吸烟。"}],"problemid":"4028e4ff415e86a901415ebb4e97003b","problemname":"住人、办公、娱乐、健身、库房等房间内吸烟。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb583be001e","measurename":"规范设置灭火器。"}],"problemid":"4028e4ff415e86a901415ebbb5ae003d","problemname":"在库房内使用电烙铁、电熨斗等电热器具和电视机、电冰箱等电器设备。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb6b1030023","measurename":"清除油漆、56度以上白酒、酒精、液化石油气钢瓶、可燃式机油、丁烷、香水、打火机、火柴、发胶、烟花爆竹等易燃易爆物品。"}],"problemid":"4028e4ff415e86a901415ebc5327003f","problemname":"储存或使用油漆、56度以上白酒、酒精、液化石油气钢瓶、可燃式机油、丁烷、香水、打火机、火柴、发胶、烟花爆竹等易燃易爆物品"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb4ad34001a","measurename":"规范设置机械通风系统或者空气调节装置。"}],"problemid":"4028e4ff415e86a901415ebda6140047","problemname":"疏散指示标志或应急照明设施设置不规范或数量不足"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb54ba7001d","measurename":"规范设置简易（自动）喷水灭火系统。"}],"problemid":"4028e4ff415e86a901415ebe67ed004b","problemname":"未设置自动（简易）喷水灭火系统。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb50ac5001c","measurename":"清出超标人员"}],"problemid":"4028e4ff415e86a901415ebf406b004d","problemname":"设置上下床，通铺，居住人员超标"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb4176c0018","measurename":"每日详实记录巡查情况"}],"problemid":"4028e4ff415e86a901415ebfdc8c0052","problemname":"未建立健全居住人员、人员来访、车辆进出、货物进出登记。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb3a4cd0016","measurename":"备齐有关防汛物资。"}],"problemid":"4028e4ff415e86a901415ec05de10057","problemname":"不具备防汛、防雨水倒灌设施。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb80b15002b","measurename":"定期对人防设备进行维护，更换损坏的设备设施。"}],"problemid":"4028e4ff415e86a901415eb91d60002f","problemname":"未按规定维护、维修人防设备设施。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb79da50028","measurename":"停止破坏行为。"}],"problemid":"4028e4ff415e86a901415eba17ec0035","problemname":"破坏结构、破坏防护设备设施"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb650360022","measurename":"清除液化石油气、煤、汽油等明火以及其他产生有害气体的燃烧器。"}],"problemid":"4028e4ff415e86a901415ebcacb00041","problemname":"用液化石油气、煤、汽油等明火以及其他产生有害气体的燃烧器"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb5c6b30020","measurename":"确保安全出口、疏散通道畅通。"}],"problemid":"4028e4ff415e86a901415ebd59f80045","problemname":"安全出口封堵、疏散通道堆放杂物"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb403580017","measurename":"配备值班人员"}],"problemid":"4028e4ff415e86a901415ec02ef20054","problemname":"无值班人员、未每日进行巡查记录"}],"projectaddress":"沈阳市铁西区颂工街4号","projectdocid":"2c9198375528f5f7015528f5fc940012","taskid":"2c93809156271083015627187e810073","tasktype":"0"},{"originid":"沈06-02007","problems":[{"checked":false,"measures":[{"measureid":"40288aff3f5b99a4013f5ee14a2e0007","measurename":"停止使用，按规定补办人防工程使用行政许可手续。"},{"measureid":"40288aff3f7374c8013f73b29c9f000f","measurename":"健全安全使用管理制度、措施、预案。"},{"measureid":"4028e4ff415e86a901415eb37e780015","measurename":"按规定张贴疏散示意图。"}],"problemid":"40288aff3f5f2dc3013f5f2e0eb60002","problemname":"未办理《人防工程使用证》，擅自使用。"},{"checked":false,"measures":[{"measureid":"40288aff3f7374c8013f73b29c9f000f","measurename":"健全安全使用管理制度、措施、预案。"}],"problemid":"40288aff3f7374c8013f73b1f652000e","problemname":"未建立安全使用管理制度、措施、预案。"},{"checked":false,"measures":[{"measureid":"40288aff3f5b99a4013f5b9fb2cd0005","measurename":"暂扣《人防工程使用证》，须按原批准用途使用。"}],"problemid":"40288aff3f7374c8013f73b1cb1d000d","problemname":"未按《人防工程使用证》批准用途使用。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb37e780015","measurename":"按规定张贴疏散示意图。"}],"problemid":"4028e4ff415e86a901415eb355e20014","problemname":"未按规定张贴疏散示意图。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb82c2a002c","measurename":"改善内部环境，保持干净、整洁。"}],"problemid":"4028e4ff415e86a901415eb88f39002d","problemname":"内部环境脏、乱、差。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb754480026","measurename":"规范设置电气线路、电源、开关、灯具。"}],"problemid":"4028e4ff415e86a901415ebb0b550039","problemname":"电气线路、电源、开关、灯具设置不规范。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb77ccf0027","measurename":"规范码放货物，杜绝人货混居。"}],"problemid":"4028e4ff415e86a901415eba7dbb0037","problemname":"货物码放不规范，人货混居"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb614e20021","measurename":"清除热得快、电炉子、电褥子、红外加热炉、油浸电气设备、大功率电器。"}],"problemid":"4028e4ff415e86a901415ebd089c0043","problemname":"使用热得快、电炉子、电褥子、红外加热炉、油浸电气设备，在住人房间内使用大功率电器。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb583be001e","measurename":"规范设置灭火器。"}],"problemid":"4028e4ff415e86a901415ebe290f0049","problemname":"灭火器数量不足或过期失效"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb4ad34001a","measurename":"规范设置机械通风系统或者空气调节装置。"}],"problemid":"4028e4ff415e86a901415ebf85060050","problemname":"未按规定设置机械通风系统或空气调节装置。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb50ac5001c","measurename":"清出超标人员"},{"measureid":"4028e4ff415e86a901415eb7e79f002a","measurename":"清出设备间内物品和人员。"}],"problemid":"4028e4ff415e86a901415eb96d060031","problemname":"人防设备间内堆物或住人。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb7c12b0029","measurename":"停止改造行为，按规定补办人防工程改造行政许可手续。"}],"problemid":"4028e4ff415e86a901415eb9bb360033","problemname":"擅自改造"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb718770025","measurename":"禁止在设有独立排风系统的吸烟室外吸烟。"}],"problemid":"4028e4ff415e86a901415ebb4e97003b","problemname":"住人、办公、娱乐、健身、库房等房间内吸烟。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb583be001e","measurename":"规范设置灭火器。"}],"problemid":"4028e4ff415e86a901415ebbb5ae003d","problemname":"在库房内使用电烙铁、电熨斗等电热器具和电视机、电冰箱等电器设备。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb6b1030023","measurename":"清除油漆、56度以上白酒、酒精、液化石油气钢瓶、可燃式机油、丁烷、香水、打火机、火柴、发胶、烟花爆竹等易燃易爆物品。"}],"problemid":"4028e4ff415e86a901415ebc5327003f","problemname":"储存或使用油漆、56度以上白酒、酒精、液化石油气钢瓶、可燃式机油、丁烷、香水、打火机、火柴、发胶、烟花爆竹等易燃易爆物品"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb4ad34001a","measurename":"规范设置机械通风系统或者空气调节装置。"}],"problemid":"4028e4ff415e86a901415ebda6140047","problemname":"疏散指示标志或应急照明设施设置不规范或数量不足"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb54ba7001d","measurename":"规范设置简易（自动）喷水灭火系统。"}],"problemid":"4028e4ff415e86a901415ebe67ed004b","problemname":"未设置自动（简易）喷水灭火系统。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb50ac5001c","measurename":"清出超标人员"}],"problemid":"4028e4ff415e86a901415ebf406b004d","problemname":"设置上下床，通铺，居住人员超标"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb4176c0018","measurename":"每日详实记录巡查情况"}],"problemid":"4028e4ff415e86a901415ebfdc8c0052","problemname":"未建立健全居住人员、人员来访、车辆进出、货物进出登记。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb3a4cd0016","measurename":"备齐有关防汛物资。"}],"problemid":"4028e4ff415e86a901415ec05de10057","problemname":"不具备防汛、防雨水倒灌设施。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb80b15002b","measurename":"定期对人防设备进行维护，更换损坏的设备设施。"}],"problemid":"4028e4ff415e86a901415eb91d60002f","problemname":"未按规定维护、维修人防设备设施。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb79da50028","measurename":"停止破坏行为。"}],"problemid":"4028e4ff415e86a901415eba17ec0035","problemname":"破坏结构、破坏防护设备设施"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb650360022","measurename":"清除液化石油气、煤、汽油等明火以及其他产生有害气体的燃烧器。"}],"problemid":"4028e4ff415e86a901415ebcacb00041","problemname":"用液化石油气、煤、汽油等明火以及其他产生有害气体的燃烧器"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb5c6b30020","measurename":"确保安全出口、疏散通道畅通。"}],"problemid":"4028e4ff415e86a901415ebd59f80045","problemname":"安全出口封堵、疏散通道堆放杂物"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb403580017","measurename":"配备值班人员"}],"problemid":"4028e4ff415e86a901415ec02ef20054","problemname":"无值班人员、未每日进行巡查记录"}],"projectaddress":"沈阳市铁西区北三东路9号","projectdocid":"2c9198375528f5f7015528f5fb34000c","taskid":"2c93809156271083015627187fba00c1","tasktype":"0"},{"originid":"沈06-02006","problems":[{"checked":false,"measures":[{"measureid":"40288aff3f5b99a4013f5ee14a2e0007","measurename":"停止使用，按规定补办人防工程使用行政许可手续。"},{"measureid":"40288aff3f7374c8013f73b29c9f000f","measurename":"健全安全使用管理制度、措施、预案。"},{"measureid":"4028e4ff415e86a901415eb37e780015","measurename":"按规定张贴疏散示意图。"}],"problemid":"40288aff3f5f2dc3013f5f2e0eb60002","problemname":"未办理《人防工程使用证》，擅自使用。"},{"checked":false,"measures":[{"measureid":"40288aff3f7374c8013f73b29c9f000f","measurename":"健全安全使用管理制度、措施、预案。"}],"problemid":"40288aff3f7374c8013f73b1f652000e","problemname":"未建立安全使用管理制度、措施、预案。"},{"checked":false,"measures":[{"measureid":"40288aff3f5b99a4013f5b9fb2cd0005","measurename":"暂扣《人防工程使用证》，须按原批准用途使用。"}],"problemid":"40288aff3f7374c8013f73b1cb1d000d","problemname":"未按《人防工程使用证》批准用途使用。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb37e780015","measurename":"按规定张贴疏散示意图。"}],"problemid":"4028e4ff415e86a901415eb355e20014","problemname":"未按规定张贴疏散示意图。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb82c2a002c","measurename":"改善内部环境，保持干净、整洁。"}],"problemid":"4028e4ff415e86a901415eb88f39002d","problemname":"内部环境脏、乱、差。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb754480026","measurename":"规范设置电气线路、电源、开关、灯具。"}],"problemid":"4028e4ff415e86a901415ebb0b550039","problemname":"电气线路、电源、开关、灯具设置不规范。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb77ccf0027","measurename":"规范码放货物，杜绝人货混居。"}],"problemid":"4028e4ff415e86a901415eba7dbb0037","problemname":"货物码放不规范，人货混居"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb614e20021","measurename":"清除热得快、电炉子、电褥子、红外加热炉、油浸电气设备、大功率电器。"}],"problemid":"4028e4ff415e86a901415ebd089c0043","problemname":"使用热得快、电炉子、电褥子、红外加热炉、油浸电气设备，在住人房间内使用大功率电器。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb583be001e","measurename":"规范设置灭火器。"}],"problemid":"4028e4ff415e86a901415ebe290f0049","problemname":"灭火器数量不足或过期失效"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb4ad34001a","measurename":"规范设置机械通风系统或者空气调节装置。"}],"problemid":"4028e4ff415e86a901415ebf85060050","problemname":"未按规定设置机械通风系统或空气调节装置。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb50ac5001c","measurename":"清出超标人员"},{"measureid":"4028e4ff415e86a901415eb7e79f002a","measurename":"清出设备间内物品和人员。"}],"problemid":"4028e4ff415e86a901415eb96d060031","problemname":"人防设备间内堆物或住人。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb7c12b0029","measurename":"停止改造行为，按规定补办人防工程改造行政许可手续。"}],"problemid":"4028e4ff415e86a901415eb9bb360033","problemname":"擅自改造"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb718770025","measurename":"禁止在设有独立排风系统的吸烟室外吸烟。"}],"problemid":"4028e4ff415e86a901415ebb4e97003b","problemname":"住人、办公、娱乐、健身、库房等房间内吸烟。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb583be001e","measurename":"规范设置灭火器。"}],"problemid":"4028e4ff415e86a901415ebbb5ae003d","problemname":"在库房内使用电烙铁、电熨斗等电热器具和电视机、电冰箱等电器设备。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb6b1030023","measurename":"清除油漆、56度以上白酒、酒精、液化石油气钢瓶、可燃式机油、丁烷、香水、打火机、火柴、发胶、烟花爆竹等易燃易爆物品。"}],"problemid":"4028e4ff415e86a901415ebc5327003f","problemname":"储存或使用油漆、56度以上白酒、酒精、液化石油气钢瓶、可燃式机油、丁烷、香水、打火机、火柴、发胶、烟花爆竹等易燃易爆物品"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb4ad34001a","measurename":"规范设置机械通风系统或者空气调节装置。"}],"problemid":"4028e4ff415e86a901415ebda6140047","problemname":"疏散指示标志或应急照明设施设置不规范或数量不足"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb54ba7001d","measurename":"规范设置简易（自动）喷水灭火系统。"}],"problemid":"4028e4ff415e86a901415ebe67ed004b","problemname":"未设置自动（简易）喷水灭火系统。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb50ac5001c","measurename":"清出超标人员"}],"problemid":"4028e4ff415e86a901415ebf406b004d","problemname":"设置上下床，通铺，居住人员超标"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb4176c0018","measurename":"每日详实记录巡查情况"}],"problemid":"4028e4ff415e86a901415ebfdc8c0052","problemname":"未建立健全居住人员、人员来访、车辆进出、货物进出登记。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb3a4cd0016","measurename":"备齐有关防汛物资。"}],"problemid":"4028e4ff415e86a901415ec05de10057","problemname":"不具备防汛、防雨水倒灌设施。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb80b15002b","measurename":"定期对人防设备进行维护，更换损坏的设备设施。"}],"problemid":"4028e4ff415e86a901415eb91d60002f","problemname":"未按规定维护、维修人防设备设施。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb79da50028","measurename":"停止破坏行为。"}],"problemid":"4028e4ff415e86a901415eba17ec0035","problemname":"破坏结构、破坏防护设备设施"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb650360022","measurename":"清除液化石油气、煤、汽油等明火以及其他产生有害气体的燃烧器。"}],"problemid":"4028e4ff415e86a901415ebcacb00041","problemname":"用液化石油气、煤、汽油等明火以及其他产生有害气体的燃烧器"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb5c6b30020","measurename":"确保安全出口、疏散通道畅通。"}],"problemid":"4028e4ff415e86a901415ebd59f80045","problemname":"安全出口封堵、疏散通道堆放杂物"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb403580017","measurename":"配备值班人员"}],"problemid":"4028e4ff415e86a901415ec02ef20054","problemname":"无值班人员、未每日进行巡查记录"}],"projectaddress":"沈阳市铁西区兴华南街37号","projectdocid":"2c9198375528f5f7015528f5fc250010","taskid":"2c93809156271083015627187eed008d","tasktype":"0"}]
         */

        public List<SafeTaskBean> safeTask;

        public List<DeviceTaskBean> getDeviceTask() {
            return deviceTask;
        }

        public void setDeviceTask(List<DeviceTaskBean> deviceTask) {
            this.deviceTask = deviceTask;
        }

        public List<SafeTaskBean> getSafeTask() {
            return safeTask;
        }

        public void setSafeTask(List<SafeTaskBean> safeTask) {
            this.safeTask = safeTask;
        }

        public static class DeviceTaskBean {
            public String tasknum;
            /**
             * devicetype1data : []
             * originid : 沈06-02009
             * projectaddress : 沈阳市铁西区兴顺街6号
             * projectdocid : 2c9198375528f5f7015528f5fb5d000e
             * taskid : 2c93809156271083015627187f5300a7
             * tasktype : 0
             */

            public List<TwotaskdataBean> twotaskdata;

            public String getTasknum() {
                return tasknum;
            }

            public void setTasknum(String tasknum) {
                this.tasknum = tasknum;
            }

            public List<TwotaskdataBean> getTwotaskdata() {
                return twotaskdata;
            }

            public void setTwotaskdata(List<TwotaskdataBean> twotaskdata) {
                this.twotaskdata = twotaskdata;
            }

            public static class TwotaskdataBean {
                public String originid;
                public String projectaddress;
                public String projectdocid;
                public String taskid;
                public String tasktype;
                public List<?> devicetype1data;

                public String getOriginid() {
                    return originid;
                }

                public void setOriginid(String originid) {
                    this.originid = originid;
                }

                public String getProjectaddress() {
                    return projectaddress;
                }

                public void setProjectaddress(String projectaddress) {
                    this.projectaddress = projectaddress;
                }

                public String getProjectdocid() {
                    return projectdocid;
                }

                public void setProjectdocid(String projectdocid) {
                    this.projectdocid = projectdocid;
                }

                public String getTaskid() {
                    return taskid;
                }

                public void setTaskid(String taskid) {
                    this.taskid = taskid;
                }

                public String getTasktype() {
                    return tasktype;
                }

                public void setTasktype(String tasktype) {
                    this.tasktype = tasktype;
                }

                public List<?> getDevicetype1data() {
                    return devicetype1data;
                }

                public void setDevicetype1data(List<?> devicetype1data) {
                    this.devicetype1data = devicetype1data;
                }
            }
        }

        public static class SafeTaskBean {
            public String tasknum;
            /**
             * originid : 沈06-02009
             * problems : [{"checked":false,"measures":[{"measureid":"40288aff3f5b99a4013f5ee14a2e0007","measurename":"停止使用，按规定补办人防工程使用行政许可手续。"},{"measureid":"40288aff3f7374c8013f73b29c9f000f","measurename":"健全安全使用管理制度、措施、预案。"},{"measureid":"4028e4ff415e86a901415eb37e780015","measurename":"按规定张贴疏散示意图。"}],"problemid":"40288aff3f5f2dc3013f5f2e0eb60002","problemname":"未办理《人防工程使用证》，擅自使用。"},{"checked":false,"measures":[{"measureid":"40288aff3f7374c8013f73b29c9f000f","measurename":"健全安全使用管理制度、措施、预案。"}],"problemid":"40288aff3f7374c8013f73b1f652000e","problemname":"未建立安全使用管理制度、措施、预案。"},{"checked":false,"measures":[{"measureid":"40288aff3f5b99a4013f5b9fb2cd0005","measurename":"暂扣《人防工程使用证》，须按原批准用途使用。"}],"problemid":"40288aff3f7374c8013f73b1cb1d000d","problemname":"未按《人防工程使用证》批准用途使用。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb37e780015","measurename":"按规定张贴疏散示意图。"}],"problemid":"4028e4ff415e86a901415eb355e20014","problemname":"未按规定张贴疏散示意图。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb82c2a002c","measurename":"改善内部环境，保持干净、整洁。"}],"problemid":"4028e4ff415e86a901415eb88f39002d","problemname":"内部环境脏、乱、差。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb754480026","measurename":"规范设置电气线路、电源、开关、灯具。"}],"problemid":"4028e4ff415e86a901415ebb0b550039","problemname":"电气线路、电源、开关、灯具设置不规范。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb77ccf0027","measurename":"规范码放货物，杜绝人货混居。"}],"problemid":"4028e4ff415e86a901415eba7dbb0037","problemname":"货物码放不规范，人货混居"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb614e20021","measurename":"清除热得快、电炉子、电褥子、红外加热炉、油浸电气设备、大功率电器。"}],"problemid":"4028e4ff415e86a901415ebd089c0043","problemname":"使用热得快、电炉子、电褥子、红外加热炉、油浸电气设备，在住人房间内使用大功率电器。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb583be001e","measurename":"规范设置灭火器。"}],"problemid":"4028e4ff415e86a901415ebe290f0049","problemname":"灭火器数量不足或过期失效"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb4ad34001a","measurename":"规范设置机械通风系统或者空气调节装置。"}],"problemid":"4028e4ff415e86a901415ebf85060050","problemname":"未按规定设置机械通风系统或空气调节装置。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb50ac5001c","measurename":"清出超标人员"},{"measureid":"4028e4ff415e86a901415eb7e79f002a","measurename":"清出设备间内物品和人员。"}],"problemid":"4028e4ff415e86a901415eb96d060031","problemname":"人防设备间内堆物或住人。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb7c12b0029","measurename":"停止改造行为，按规定补办人防工程改造行政许可手续。"}],"problemid":"4028e4ff415e86a901415eb9bb360033","problemname":"擅自改造"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb718770025","measurename":"禁止在设有独立排风系统的吸烟室外吸烟。"}],"problemid":"4028e4ff415e86a901415ebb4e97003b","problemname":"住人、办公、娱乐、健身、库房等房间内吸烟。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb583be001e","measurename":"规范设置灭火器。"}],"problemid":"4028e4ff415e86a901415ebbb5ae003d","problemname":"在库房内使用电烙铁、电熨斗等电热器具和电视机、电冰箱等电器设备。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb6b1030023","measurename":"清除油漆、56度以上白酒、酒精、液化石油气钢瓶、可燃式机油、丁烷、香水、打火机、火柴、发胶、烟花爆竹等易燃易爆物品。"}],"problemid":"4028e4ff415e86a901415ebc5327003f","problemname":"储存或使用油漆、56度以上白酒、酒精、液化石油气钢瓶、可燃式机油、丁烷、香水、打火机、火柴、发胶、烟花爆竹等易燃易爆物品"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb4ad34001a","measurename":"规范设置机械通风系统或者空气调节装置。"}],"problemid":"4028e4ff415e86a901415ebda6140047","problemname":"疏散指示标志或应急照明设施设置不规范或数量不足"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb54ba7001d","measurename":"规范设置简易（自动）喷水灭火系统。"}],"problemid":"4028e4ff415e86a901415ebe67ed004b","problemname":"未设置自动（简易）喷水灭火系统。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb50ac5001c","measurename":"清出超标人员"}],"problemid":"4028e4ff415e86a901415ebf406b004d","problemname":"设置上下床，通铺，居住人员超标"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb4176c0018","measurename":"每日详实记录巡查情况"}],"problemid":"4028e4ff415e86a901415ebfdc8c0052","problemname":"未建立健全居住人员、人员来访、车辆进出、货物进出登记。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb3a4cd0016","measurename":"备齐有关防汛物资。"}],"problemid":"4028e4ff415e86a901415ec05de10057","problemname":"不具备防汛、防雨水倒灌设施。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb80b15002b","measurename":"定期对人防设备进行维护，更换损坏的设备设施。"}],"problemid":"4028e4ff415e86a901415eb91d60002f","problemname":"未按规定维护、维修人防设备设施。"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb79da50028","measurename":"停止破坏行为。"}],"problemid":"4028e4ff415e86a901415eba17ec0035","problemname":"破坏结构、破坏防护设备设施"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb650360022","measurename":"清除液化石油气、煤、汽油等明火以及其他产生有害气体的燃烧器。"}],"problemid":"4028e4ff415e86a901415ebcacb00041","problemname":"用液化石油气、煤、汽油等明火以及其他产生有害气体的燃烧器"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb5c6b30020","measurename":"确保安全出口、疏散通道畅通。"}],"problemid":"4028e4ff415e86a901415ebd59f80045","problemname":"安全出口封堵、疏散通道堆放杂物"},{"checked":false,"measures":[{"measureid":"4028e4ff415e86a901415eb403580017","measurename":"配备值班人员"}],"problemid":"4028e4ff415e86a901415ec02ef20054","problemname":"无值班人员、未每日进行巡查记录"}]
             * projectaddress : 沈阳市铁西区兴顺街6号
             * projectdocid : 2c9198375528f5f7015528f5fb5d000e
             * taskid : 2c93809156271083015627187f5300a7
             * tasktype : 0
             */

            public List<TwotaskdataBean> twotaskdata;

            public String getTasknum() {
                return tasknum;
            }

            public void setTasknum(String tasknum) {
                this.tasknum = tasknum;
            }

            public List<TwotaskdataBean> getTwotaskdata() {
                return twotaskdata;
            }

            public void setTwotaskdata(List<TwotaskdataBean> twotaskdata) {
                this.twotaskdata = twotaskdata;
            }

            public static class TwotaskdataBean {
                public String originid;
                public String projectaddress;
                public String projectdocid;
                public String taskid;
                public String tasktype;
                /**
                 * checked : false
                 * measures : [{"measureid":"40288aff3f5b99a4013f5ee14a2e0007","measurename":"停止使用，按规定补办人防工程使用行政许可手续。"},{"measureid":"40288aff3f7374c8013f73b29c9f000f","measurename":"健全安全使用管理制度、措施、预案。"},{"measureid":"4028e4ff415e86a901415eb37e780015","measurename":"按规定张贴疏散示意图。"}]
                 * problemid : 40288aff3f5f2dc3013f5f2e0eb60002
                 * problemname : 未办理《人防工程使用证》，擅自使用。
                 */

                public List<ProblemsBean> problems;

                public String getOriginid() {
                    return originid;
                }

                public void setOriginid(String originid) {
                    this.originid = originid;
                }

                public String getProjectaddress() {
                    return projectaddress;
                }

                public void setProjectaddress(String projectaddress) {
                    this.projectaddress = projectaddress;
                }

                public String getProjectdocid() {
                    return projectdocid;
                }

                public void setProjectdocid(String projectdocid) {
                    this.projectdocid = projectdocid;
                }

                public String getTaskid() {
                    return taskid;
                }

                public void setTaskid(String taskid) {
                    this.taskid = taskid;
                }

                public String getTasktype() {
                    return tasktype;
                }

                public void setTasktype(String tasktype) {
                    this.tasktype = tasktype;
                }

                public List<ProblemsBean> getProblems() {
                    return problems;
                }

                public void setProblems(List<ProblemsBean> problems) {
                    this.problems = problems;
                }

                public static class ProblemsBean {
                    public boolean checked;
                    public String problemid;
                    public String problemname;
                    /**
                     * measureid : 40288aff3f5b99a4013f5ee14a2e0007
                     * measurename : 停止使用，按规定补办人防工程使用行政许可手续。
                     */

                    public List<MeasuresBean> measures;

                    public boolean isChecked() {
                        return checked;
                    }

                    public void setChecked(boolean checked) {
                        this.checked = checked;
                    }

                    public String getProblemid() {
                        return problemid;
                    }

                    public void setProblemid(String problemid) {
                        this.problemid = problemid;
                    }

                    public String getProblemname() {
                        return problemname;
                    }

                    public void setProblemname(String problemname) {
                        this.problemname = problemname;
                    }

                    public List<MeasuresBean> getMeasures() {
                        return measures;
                    }

                    public void setMeasures(List<MeasuresBean> measures) {
                        this.measures = measures;
                    }

                    public static class MeasuresBean {
                        public String measureid;
                        public String measurename;

                        public String getMeasureid() {
                            return measureid;
                        }

                        public void setMeasureid(String measureid) {
                            this.measureid = measureid;
                        }

                        public String getMeasurename() {
                            return measurename;
                        }

                        public void setMeasurename(String measurename) {
                            this.measurename = measurename;
                        }
                    }
                }
            }
        }
    }

    public static class HeadBean {
        public String rtnCode;
        public String rtnMsg;

        public String getRtnCode() {
            return rtnCode;
        }

        public void setRtnCode(String rtnCode) {
            this.rtnCode = rtnCode;
        }

        public String getRtnMsg() {
            return rtnMsg;
        }

        public void setRtnMsg(String rtnMsg) {
            this.rtnMsg = rtnMsg;
        }
    }
}
