package src.ch06.siglneton;

public class Company {
    // 2. 유일한 instance 초기화
    private static Company instance = new Company();
    
    
    // 1. 생성자 -> private
    private Company() {}
    
    // 3. getter 정의
    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
