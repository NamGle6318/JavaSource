package member;

import lombok.*;

@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class MemberDTO {
    private int no;// member_seq SEQUENCE
    private String id; // primary key
    private String name;
    private String addr;
    private String email;
    private int age;
    private String remark;

    // builder 관련 메서드
}
