package member;

import lombok.*;

@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class MemberDTO {
    private String id;
    private String name;
    private String addr;
    private String email;
    private int age;
    private String remark;
}
