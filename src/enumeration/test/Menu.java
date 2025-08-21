package enumeration.test;

public enum Menu {
    MAIN(1, "메인 화면"), EMAIL(2, "이메일 관리 화면"), ADMIN(3, "관리자 화면");

    private final int level;
    private final String description;

    Menu(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }
}
