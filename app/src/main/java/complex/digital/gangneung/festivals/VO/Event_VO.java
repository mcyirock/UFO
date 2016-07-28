package complex.digital.gangneung.festivals.VO;

import java.util.List;

/**
 * Created by Kay on 7/14/16.
 */
public class Event_VO {

    public Event_VO(String para){
        if(para.equals("dano")){
            this.title = "강릉단오제";
            this.logo = "@drawable/logo_fev1";
            this.main_image = "@drawable/fev1_02";
            this.event_date = "2016.06.05 ~ 2016.06.12";
            this.event_long_description = "강릉에서 단오는 큰 명절이다. 단오를 중심으로 8일간의 축제, 그 속에서 펼쳐지는 신과 인간의 소통은 자연과 인간, 인간과 인간의 상생을 위한 휴먼드라마이다.";
            this.event_short_description = "단오를 중심으로 8일간의 축제";
            this.info_info_pic = "@drawable/fev1_03";
            this.info_info_text = "강릉에서 단오는 큰 명절이다. 단오를 중심으로 8일간의 축제, 그 속에서 펼쳐지는 신과 인간의 소통은 자연과 인간, 인간과 인간의 상생을 위한 휴먼드라마이다.";
            this.info_hist_pic = "@drawable/fev1_04";
            this.info_hist_text = "문화적 침탈을 일삼았던 일제강점기에도 단오제는 열렸고, 중요한 기록을 남겼다. 한국전쟁 중에도 단오제는 맥을 이어왔다. 노인들과 무녀들은 시기적으로 어려울 때는 압박의 눈을 피해 중앙시장이나 남대천 변, 성남동 한구석에서 소규모로 나마 빼놓지 않고 단오제를 치뤘다고 증언한다. 이처럼 강릉단오제는 비교적 온전히 전승되고 있거나 고증을 통하여 원형 복원이 가능할 만큼 면면히 이어지고 있었다는 것이다. 이런 덕분에 강릉단오제는 1967년 중요무형문화제 13호로 등록되면서 우리민족 전통 민속축제의 원형성을 간직한 단오축제로서 고유의 가치를 획득하였다. 2005년 11월에는 유네스코가 지정하는 인류구전 및 무형 유산 걸작으로 등재되어 전 세계의 인류가 보존해야 할 문화유산이 되었다.";
            this.info_program_pic = "@drawable/fev1_05";
            this.info_program_text = "프로그램 텍스트";
            this.info_location_pic = "@drawable/fev1_06";
            this.info_location_text = "강원도 강릉시 단오장길 1 (노암동 722-2) 강릉단오문화관";
            this.info_contact_pic = "@drawable/fev1_07";
            this.info_contact_text = "전화 033-641-1593\\n" +
                    "팩스 033-646-1595\\n" +
                    "이메일 faq@danofest.com";
        }else if(para.equals("coffee")){
            this.title = "커피축제";
            this.logo = "@drawable/fev2_logo";
            this.main_image = "@drawable/fev2_02";
            this.event_date = "2016.09.30 ~ 2016.10.03";
            this.event_long_description = "아침에 눈을 뜨자마자 그라인더에서 풍겨나는 커피향에 취합니다. 향긋한 커피 한잔에  강릉을 담습니다. 설레는 마음으로 강릉커피축제의 여덟 번째 초대를 시작합니다.";
            this.event_short_description = "2016 제 8회 강릉커피축제";
            this.info_info_pic = "@drawable/fev2_03";
            this.info_info_text = "강릉에서 단오는 큰 명절이다. 단오를 중심으로 8일간의 축제, 그 속에서 펼쳐지는 신과 인간의 소통은 자연과 인간, 인간과 인간의 상생을 위한 휴먼드라마이다.";
            this.info_hist_pic = "@drawable/fev2_04";
            this.info_hist_text = "문화적 침탈을 일삼았던 일제강점기에도 단오제는 열렸고, 중요한 기록을 남겼다. 한국전쟁 중에도 단오제는 맥을 이어왔다. 노인들과 무녀들은 시기적으로 어려울 때는 압박의 눈을 피해 중앙시장이나 남대천 변, 성남동 한구석에서 소규모로 나마 빼놓지 않고 단오제를 치뤘다고 증언한다. 이처럼 강릉단오제는 비교적 온전히 전승되고 있거나 고증을 통하여 원형 복원이 가능할 만큼 면면히 이어지고 있었다는 것이다. 이런 덕분에 강릉단오제는 1967년 중요무형문화제 13호로 등록되면서 우리민족 전통 민속축제의 원형성을 간직한 단오축제로서 고유의 가치를 획득하였다. 2005년 11월에는 유네스코가 지정하는 인류구전 및 무형 유산 걸작으로 등재되어 전 세계의 인류가 보존해야 할 문화유산이 되었다.";
            this.info_program_pic = "@drawable/fev2_05";
            this.info_program_text = "프로그램 텍스트";
            this.info_location_pic = "@drawable/fev2_06";
            this.info_location_text = "강원도 강릉시 단오장길 1 (노암동 722-2) 강릉단오문화관";
            this.info_contact_pic = "@drawable/fev2_07";
            this.info_contact_text = "전화 033-641-1593\\n" +
                    "팩스 033-646-1595\\n" +
                    "이메일 faq@danofest.com";
        }else if(para.equals("tanger")){
            this.title = "삼척 맹방 유채꽃 축제";
            this.logo = "@drawable/fev3_logo";
            this.main_image = "@drawable/fev3_01";
            this.event_date = "2016.04.08 ~ 2016.04.17";
            this.event_long_description = "강릉에서 단오는 큰 명절이다. 단오를 중심으로 8일간의 축제, 그 속에서 펼쳐지는 신과 인간의 소통은 자연과 인간, 인간과 인간의 상생을 위한 휴먼드라마이다.";
            this.event_short_description = "단오를 중심으로 8일간의 축제";
            this.info_info_pic = "@drawable/fev1_03";
            this.info_info_text = "강릉에서 단오는 큰 명절이다. 단오를 중심으로 8일간의 축제, 그 속에서 펼쳐지는 신과 인간의 소통은 자연과 인간, 인간과 인간의 상생을 위한 휴먼드라마이다.";
            this.info_hist_pic = "@drawable/fev1_04";
            this.info_hist_text = "문화적 침탈을 일삼았던 일제강점기에도 단오제는 열렸고, 중요한 기록을 남겼다. 한국전쟁 중에도 단오제는 맥을 이어왔다. 노인들과 무녀들은 시기적으로 어려울 때는 압박의 눈을 피해 중앙시장이나 남대천 변, 성남동 한구석에서 소규모로 나마 빼놓지 않고 단오제를 치뤘다고 증언한다. 이처럼 강릉단오제는 비교적 온전히 전승되고 있거나 고증을 통하여 원형 복원이 가능할 만큼 면면히 이어지고 있었다는 것이다. 이런 덕분에 강릉단오제는 1967년 중요무형문화제 13호로 등록되면서 우리민족 전통 민속축제의 원형성을 간직한 단오축제로서 고유의 가치를 획득하였다. 2005년 11월에는 유네스코가 지정하는 인류구전 및 무형 유산 걸작으로 등재되어 전 세계의 인류가 보존해야 할 문화유산이 되었다.";
            this.info_program_pic = "@drawable/fev1_05";
            this.info_program_text = "프로그램 텍스트";
            this.info_location_pic = "@drawable/fev1_06";
            this.info_location_text = "강원도 강릉시 단오장길 1 (노암동 722-2) 강릉단오문화관";
            this.info_contact_pic = "@drawable/fev1_07";
            this.info_contact_text = "전화 033-641-1593\\n" +
                    "팩스 033-646-1595\\n" +
                    "이메일 faq@danofest.com";
        }else if(para.equals("squid")){
            this.title = "오징어축제";
            this.logo = "@drawable/fev3_logo";
            this.main_image = "@drawable/fev3_02";
            this.event_date = "2016.06.05 ~ 2016.06.12";
            this.event_long_description = "강릉에서 단오는 큰 명절이다. 단오를 중심으로 8일간의 축제, 그 속에서 펼쳐지는 신과 인간의 소통은 자연과 인간, 인간과 인간의 상생을 위한 휴먼드라마이다.";
            this.event_short_description = "단오를 중심으로 8일간의 축제";
            this.info_info_pic = "@drawable/fev1_03";
            this.info_info_text = "강릉에서 단오는 큰 명절이다. 단오를 중심으로 8일간의 축제, 그 속에서 펼쳐지는 신과 인간의 소통은 자연과 인간, 인간과 인간의 상생을 위한 휴먼드라마이다.";
            this.info_hist_pic = "@drawable/fev1_04";
            this.info_hist_text = "문화적 침탈을 일삼았던 일제강점기에도 단오제는 열렸고, 중요한 기록을 남겼다. 한국전쟁 중에도 단오제는 맥을 이어왔다. 노인들과 무녀들은 시기적으로 어려울 때는 압박의 눈을 피해 중앙시장이나 남대천 변, 성남동 한구석에서 소규모로 나마 빼놓지 않고 단오제를 치뤘다고 증언한다. 이처럼 강릉단오제는 비교적 온전히 전승되고 있거나 고증을 통하여 원형 복원이 가능할 만큼 면면히 이어지고 있었다는 것이다. 이런 덕분에 강릉단오제는 1967년 중요무형문화제 13호로 등록되면서 우리민족 전통 민속축제의 원형성을 간직한 단오축제로서 고유의 가치를 획득하였다. 2005년 11월에는 유네스코가 지정하는 인류구전 및 무형 유산 걸작으로 등재되어 전 세계의 인류가 보존해야 할 문화유산이 되었다.";
            this.info_program_pic = "@drawable/fev1_05";
            this.info_program_text = "프로그램 텍스트";
            this.info_location_pic = "@drawable/fev1_06";
            this.info_location_text = "강원도 강릉시 단오장길 1 (노암동 722-2) 강릉단오문화관";
            this.info_contact_pic = "@drawable/fev1_07";
            this.info_contact_text = "전화 033-641-1593\\n" +
                    "팩스 033-646-1595\\n" +
                    "이메일 faq@danofest.com";
        }

    }
    private String title;
    private String logo;
    private String main_image;
    private String event_date;
    private String event_long_description;
    private String event_short_description;

    private String info_info_pic;
    private String info_info_text;
    private String info_hist_pic;
    private String info_hist_text;
    private String info_program_pic;
    private String info_program_text;
    private String info_location_pic;
    private String info_location_text;
    private String info_contact_pic;
    private String info_contact_text;

    private List<Notice_VO> noticeList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getMain_image() {
        return main_image;
    }

    public void setMain_image(String main_image) {
        this.main_image = main_image;
    }

    public String getEvent_date() {
        return event_date;
    }

    public void setEvent_date(String event_date) {
        this.event_date = event_date;
    }

    public String getEvent_long_description() {
        return event_long_description;
    }

    public void setEvent_long_description(String event_long_description) {
        this.event_long_description = event_long_description;
    }

    public String getEvent_short_description() {
        return event_short_description;
    }

    public void setEvent_short_description(String event_short_description) {
        this.event_short_description = event_short_description;
    }


    public String getInfo_info_pic() {
        return info_info_pic;
    }

    public void setInfo_info_pic(String info_info_pic) {
        this.info_info_pic = info_info_pic;
    }

    public String getInfo_info_text() {
        return info_info_text;
    }

    public void setInfo_info_text(String info_info_text) {
        this.info_info_text = info_info_text;
    }

    public String getInfo_hist_pic() {
        return info_hist_pic;
    }

    public void setInfo_hist_pic(String info_hist_pic) {
        this.info_hist_pic = info_hist_pic;
    }

    public String getInfo_hist_text() {
        return info_hist_text;
    }

    public void setInfo_hist_text(String info_hist_text) {
        this.info_hist_text = info_hist_text;
    }

    public String getInfo_program_pic() {
        return info_program_pic;
    }

    public void setInfo_program_pic(String info_program_pic) {
        this.info_program_pic = info_program_pic;
    }

    public String getInfo_program_text() {
        return info_program_text;
    }

    public void setInfo_program_text(String info_program_text) {
        this.info_program_text = info_program_text;
    }

    public String getInfo_location_pic() {
        return info_location_pic;
    }

    public void setInfo_location_pic(String info_location_pic) {
        this.info_location_pic = info_location_pic;
    }

    public String getInfo_location_text() {
        return info_location_text;
    }

    public void setInfo_location_text(String info_location_text) {
        this.info_location_text = info_location_text;
    }

    public String getInfo_contact_pic() {
        return info_contact_pic;
    }

    public void setInfo_contact_pic(String info_contact_pic) {
        this.info_contact_pic = info_contact_pic;
    }

    public String getInfo_contact_text() {
        return info_contact_text;
    }

    public void setInfo_contact_text(String info_contact_text) {
        this.info_contact_text = info_contact_text;
    }

    public List<Notice_VO> getNoticeList() {
        return noticeList;
    }

    public void setNoticeList(List<Notice_VO> noticeList) {
        this.noticeList = noticeList;
    }
}
