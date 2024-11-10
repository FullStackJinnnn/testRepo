package infinitystone.chalKag.controller.admin;

import infinitystone.chalKag.biz.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminTimeOutListController2 {

  @Autowired
  private MemberService memberService;

// 정지 당한 회원 목록 출력
  @RequestMapping(value = "/adminWebContent", method = RequestMethod.GET)
  public String adminWebContent() {


    return "admin/adminWebContent";
  }

}