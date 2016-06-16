package com.cocoamk.okhttp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Cocoamk on 16/6/15.
 */
public class ContentBean {


    /**
     * image : http://img3.douban.com/view/event_poster/median/public/10f53a2ad8b38c5.jpg
     * adapt_url : http://www.douban.com/location/partner/event/21185304/
     * owner : {"name":"国家博物馆","avatar":"http://img3.douban.com/view/site/small/public/6510ea4ea1cc8e6.jpg","uid":"127320","alt":"http://site.douban.com/127320/","type":"site","id":"127320","large_avatar":"http://img3.douban.com/pics/site/icon_default_large.png"}
     * loc_name : 北京
     * alt : http://www.douban.com/event/21185304/
     * id : 21185304
     * category : exhibition
     * title : 罗马与巴洛克艺术
     * wisher_count : 1975
     * has_ticket : false
     * content : 展期：2014/4/30 - 2015/2/28（展期以此为准）
     地点：北16展厅
     主办：中国国家博物馆
     　　　意大利文化遗产活动和旅游部文化遗产开发司
     　　　罗马历史、艺术、民族人类遗产及博物馆联盟特署
     门票：30元（请入馆后至展厅门口购票参观）

     展览详情：http://www.chnmuseum.cn/tabid/236/Default.aspx?ExhibitionLanguageID=388

     【提示】展厅内请勿拍照，请勿触摸展品；二维码导览、微信语音导览即将开放。2014年7-8月将进行一次展品更换，卡拉奇的《青年男子肖像》、卡拉瓦乔的《施洗约翰》届时将展出。

     　　（暑期观众较多，为保证良好参观体验，建议您延期参观或合理安排参观时间，尽量避开周末及假期高峰时段。）

     “罗马与巴洛克艺术”展由中国国家博物馆、意大利文化遗产活动和旅游部文化遗产开发司及罗马历史、艺术、民族人类遗产及博物馆联盟特署联合举办。这是执行中意两国政府达成的五年文化合作计划，继“佛罗伦萨与文艺复兴：名家名作”展之后的又一个精彩展览。

     巴洛克艺术是十七世纪欧洲广为流行的艺术风格。罗马作为巴洛克艺术的发源地再次成为十七世纪意大利和欧洲的艺术中心。聚集在罗马的众多意大利和欧洲艺术名家以其高超的艺术造诣和丰富的创造力，为这座永恒之城留下了大量弥足珍贵的艺术瑰宝。

     为了展现十七世纪罗马的整体艺术风貌特别是罗马巴洛克艺术的独特魅力，中意双方历时一年多精心策划了“罗马与巴洛克艺术”这一主题展览。此次展览汇集了50件（套）十七世纪意大利的绘画、雕塑和工艺品。全部展品精选自罗马威尼斯宫国立博物馆、科西尼宫国立古代艺术馆、巴贝里尼宫国立古代艺术馆、基吉宫巴洛克博物馆、斯巴达美术馆等10余家意大利著名博物馆、艺术馆和相关收藏机构，包括卡拉齐、卡拉瓦乔、贝尼尼、科尔托纳、阿尔加迪、普桑、安德烈亚·萨基、弗朗西斯科·科扎、乔万·巴蒂斯塔·高利、贾钦托·布兰迪等20余名活跃在十七世纪罗马艺术舞台上的艺术大师和著名艺术家的艺术精品，涵盖了以巴洛克为主体的多种艺术风格。

     此次展览以十七世纪罗马艺术史的发展脉络为主线，划分为走向巴洛克及其自然主义的表现、巴洛克雕塑和巴洛克绘画三个部分，重点介绍和展示罗马巴洛克艺术，同时兼顾同时期的其他艺术风格，为广大观众呈现一幅十七世纪的罗马艺术全景画卷。

     国博豆瓣小站：http://site.douban.com/127320/
     * can_invite : no
     * album : 127782312
     * participant_count : 1645
     * image_hlarge : http://img3.douban.com/view/event_poster/hlarge/public/365aa3c50b5ba01.jpg
     * photos : ["http://img3.douban.com/view/photo/photo/public/p2197249325.jpg","http://img3.douban.com/view/photo/photo/public/p2193380232.jpg","http://img3.douban.com/view/photo/photo/public/p2192517302.jpg","http://img5.douban.com/view/photo/photo/public/p2191745057.jpg","http://img5.douban.com/view/photo/photo/public/p2189803139.jpg"]
     * begin_time : 2014-07-22 09:00:00
     * geo : 39.905148 116.401711
     * image_lmobile : http://img3.douban.com/view/event_poster/lmobile/public/10f53a2ad8b38c5.jpg
     * category_name : 展览
     * loc_id : 108288
     * end_time : 2014-10-16 17:00:00
     * address : 北京 东城区 东长安街16号中国国家博物馆
     */

    private List<EventsBean> events;

    public List<EventsBean> getEvents() {
        return events;
    }

    public void setEvents(List<EventsBean> events) {
        this.events = events;
    }

    public static class EventsBean {


        private String image;
        private String adapt_url;
        /**
         * name : 国家博物馆
         * avatar : http://img3.douban.com/view/site/small/public/6510ea4ea1cc8e6.jpg
         * uid : 127320
         * alt : http://site.douban.com/127320/
         * type : site
         * id : 127320
         * large_avatar : http://img3.douban.com/pics/site/icon_default_large.png
         */

        private OwnerBean owner;
        private String loc_name;
        private String alt;
        private String id;
        private String category;
        private String title;
        private int wisher_count;
        private boolean has_ticket;
        private String content;
        private String can_invite;
        private String album;
        private int participant_count;
        private String image_hlarge;
        private String begin_time;
        private String geo;
        private String image_lmobile;
        private String category_name;
        private String loc_id;
        private String end_time;
        private String address;
        private List<String> photos;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getAdapt_url() {
            return adapt_url;
        }

        public void setAdapt_url(String adapt_url) {
            this.adapt_url = adapt_url;
        }

        public OwnerBean getOwner() {
            return owner;
        }

        public void setOwner(OwnerBean owner) {
            this.owner = owner;
        }

        public String getLoc_name() {
            return loc_name;
        }

        public void setLoc_name(String loc_name) {
            this.loc_name = loc_name;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getWisher_count() {
            return wisher_count;
        }

        public void setWisher_count(int wisher_count) {
            this.wisher_count = wisher_count;
        }

        public boolean isHas_ticket() {
            return has_ticket;
        }

        public void setHas_ticket(boolean has_ticket) {
            this.has_ticket = has_ticket;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCan_invite() {
            return can_invite;
        }

        public void setCan_invite(String can_invite) {
            this.can_invite = can_invite;
        }

        public String getAlbum() {
            return album;
        }

        public void setAlbum(String album) {
            this.album = album;
        }

        public int getParticipant_count() {
            return participant_count;
        }

        public void setParticipant_count(int participant_count) {
            this.participant_count = participant_count;
        }

        public String getImage_hlarge() {
            return image_hlarge;
        }

        public void setImage_hlarge(String image_hlarge) {
            this.image_hlarge = image_hlarge;
        }

        public String getBegin_time() {
            return begin_time;
        }

        public void setBegin_time(String begin_time) {
            this.begin_time = begin_time;
        }

        public String getGeo() {
            return geo;
        }

        public void setGeo(String geo) {
            this.geo = geo;
        }

        public String getImage_lmobile() {
            return image_lmobile;
        }

        public void setImage_lmobile(String image_lmobile) {
            this.image_lmobile = image_lmobile;
        }

        public String getCategory_name() {
            return category_name;
        }

        public void setCategory_name(String category_name) {
            this.category_name = category_name;
        }

        public String getLoc_id() {
            return loc_id;
        }

        public void setLoc_id(String loc_id) {
            this.loc_id = loc_id;
        }

        public String getEnd_time() {
            return end_time;
        }

        public void setEnd_time(String end_time) {
            this.end_time = end_time;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public List<String> getPhotos() {
            return photos;
        }

        public void setPhotos(List<String> photos) {
            this.photos = photos;
        }

        public static class OwnerBean {
            private String name;
            private String avatar;
            private String uid;
            private String alt;
            private String type;
            private String id;
            private String large_avatar;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getLarge_avatar() {
                return large_avatar;
            }

            public void setLarge_avatar(String large_avatar) {
                this.large_avatar = large_avatar;
            }
        }
    }
}
