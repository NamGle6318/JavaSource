package oop;

import extend.Parent;

// modifier(제어자)
// 접근제어자 : public, protected, default, private
// 기타 : static, final, abstract, synchronized, native 등등

// static : 공통적인(공유) - Card
// final : 마지막의, 변경될 수 없는(클래스{상속금지}, 메서드{Overriding 금지}, 멤버변수{상수}, 지역변수{상수}) 

// 접근제어자(캡슐화 = 멤버변수 정보은닉)
// public : 접근 제한이 없음.
// protected : 같은 패키지 내에서 사용가능하나, 
//             다른 패키지일경우 자손 클래스에서 접근 가능
// default : 같은 패키지 내에서만 사용가능 (다른 접근제어자들을 사용 안하는 경우)
// private : 같은 클래스 내에서만 접근 가능 

public class ModifierEx {
    final int x = 1;
}
