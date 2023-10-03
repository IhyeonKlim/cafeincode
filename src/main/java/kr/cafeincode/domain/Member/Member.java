package kr.cafeincode.domain;

import lombok.Data;

@Data
public class Member {
    private String userId;
    private String password;
    private String userNm;
    private String roleCd;
    private String teamCd;
    private String nickNm;
    private String email;
    private String userAccount;
    private String linkedInUrl;
    private String userIp;
    private String loginLockYn;
    private String loginFailCnt;
    private String delYn;
    private String lastLoginDt;
    private String regDt;
    private String passSetDt;
}
