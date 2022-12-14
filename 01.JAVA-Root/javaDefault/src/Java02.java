
public class Java02 {
    public static void main(String[] args) {
        /*
        [ 자바 변수 ]

        변수는 데이터 값을 저장하기 위한 컨테이너

        [ 변수의 선언과 사용형식 ]
        데이터형 변수명 = type에 맞는 값

        
            [ Java 변수 유형 ]

            String
            - "Hello"와 같은 텍스트를 저장 문자열 값은 큰따옴표사용!
            int
            - 123 또는 -123과 같이 소수 없이 정수(정수)를 저장
            float
            - 19.99 또는 -19.99와 같은 소수를 사용. 부동 소수점 숫자를 저장
            char
            - 'a' 또는 'B'와 같은 단일 문자를 저장. Char 값은 작은따옴표사용!
            boolean
            - true / false

        */ 
        // 1. 문자형
        String nameKim = "김석구";
        System.out.println(nameKim);

        // 2. 정수형
        int myNum = 1000;
        System.out.println(myNum + "라인의 코딩을 할겁니다!");

        myNum = 2500;
        System.out.println(myNum + "라인의 코딩을 할겁니다!");
        
        // 자바에서 상수는? 변수선언 앞에 final키워드 사용

        final int newNum = 7000;
        // newNum = 8000;
        System.out.println(newNum + "라인의 코딩을 할겁니다!");
        
        String nameTom = "톰 행커스";
        System.out.println("안녕" + nameTom);
        System.out.println(String.format("DDDD", nameTom));
        
        String familyName = "김씨";
        String myName = "오룡";
        String fullName = familyName + myName;
        System.out.println(fullName);

        int x = 5, y = 6, z = 50;
        System.out.println(x + "와 " + y + "와 " + z +"의 합은?" + (x+y+z));

        // 이런 방식도 있어
        // 같은 형의 변수를 한꺼번에 선언하고
        // 같은 값을 여러 같은 형의 변수에 넣을때
        int xx,yy,zz;
        xx = yy = zz = 50;
        System.out.println(xx + ", " +  yy + ", " +  zz + " = " + (xx+yy+zz));

    /* _________________________________________________________________

         * [ 변수 이름 규칙 ]

            1. 문자, 숫자, 밑줄 및 달러 기호 포함가능
            2. 문자로 시작
            3. 소문자로 시작
            4. 중간 공백 안됨
            5. $ 및 _로 시작할 수도 있음
            6. 대소문자를 구분
            7. 예약어사용불가 
         

          _________________________________________________________
    */


    /*
                    
            [ 데이터 유형 ]
            -> 두 그룹으로 나뉩니다.

            1. 기본 데이터 유형 (8가지)
            
            - 정수형 데이터
            (1) byte	1 byte	 -128 ~ 127
            (2) short	2 bytes	 -32,768 ~ 32,767
            (3) int		4 bytes	 -21억 ~ 21억
            (4) long	8 bytes	 -9백경 ~ 9백경
            - 실수형 데이터
            (5) float	4 bytes	 소수 6 to 7 자릿수
            (6) double	8 bytes	 소수 15 자릿수
            (7) boolean	1 bit	 true / false
            (8) char	2 bytes	 한문자 or 아스키값

            ->>>(질문) 
            Java에는 많은 숫자 유형이 있지만 
            숫자에 가장 많이 사용되는 유형은? 
            (답)
            int(정수) 및 double(부동 소수점 숫자)

            ******************************************/
            int iamInt = 5;
            float iamFloat = 5.99f;
            char iamChar = 'D';
            boolean iamBoolean = true;
            String iamString = "안뇽";
            
            System.out.println(iamBoolean);
            System.out.println(iamInt);
            System.out.println(iamString);
            System.out.println(iamChar);
            System.out.println(iamFloat);

            System.out.println("");
            // 데이터별 크기체크

            // 1. byte : -128~127
            byte numByte = -128;
            System.out.println("byte : " + numByte);
             
            // 2. short : -32,268 ~ 32768 
            // -> 0때문에 자릿수 하나 적음

            short numShort = 32767;
            System.out.println("short " + numShort);
            
            // 3. int : -2,147,483,648 ~ 2,147,483,647
            int numInt = 2147483647;
            System.out.println("int : " + numInt);
            
            // long : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
            long numLong = 9223372036854775807L;
            // 특이사항 -> 범위안에 숫자일 지라도 끝에 L 적어줌

            System.out.println("long : " + numLong);
            
            /*****************************************
             2. 기본이 아닌 데이터 유형
            - String, 배열 및 클래스 등

            * String 유형은 Java에서 너무 많이 사용되고 통합되어 
            * 일부에서는 이를 "특별한 아홉 번째 유형"이라고 불리움.
            * (기본유형이 8개 이므로^^)
            * 
            * Java의 String은 객체를 참조하기 때문에 실제로는 
            * 기본이 아닌 데이터 유형 String 객체에는 문자열에 대한 
            * 특정 작업을 수행하는데 사용되는 메서드가 있음.
            [ 기본이 아닌 데이터 유형 ]
            기본이 아닌 데이터 형식은 개체를 참조하기 때문에 
            참조 형식 이라고함.

            (기본 데이터 유형 과 기본 이 아닌 데이터 유형 의 주요 차이점)

            기본 유형은 Java에서 사전 정의(이미 정의)되어 있음 
            기본이 아닌 유형은 프로그래머에 의해 생성되며 
            Java에 의해 정의되지 않음( 제외 String).

            기본 유형이 아닌 유형은 특정 작업을 수행하기 위해 
            메소드를 호출하는 데 사용할 수 있지만 기본 유형은 불가능함

            기본 유형에는 항상 값이 있는 반면 기본 유형이 아닌 유형은 null.
            기본 유형은 소문자로 시작하고 기본 유형이 아닌 유형은 대문자로 시작.
            기본 유형의 크기는 데이터 유형에 따라 달라지지만 
            기본 유형이 아닌 유형은 모두 동일한 크기를 갖음.

            기본이 아닌 유형의 예로는 
            Strings / Arrays / Classes / Interface 등이 있음
    */ 
    }
}
