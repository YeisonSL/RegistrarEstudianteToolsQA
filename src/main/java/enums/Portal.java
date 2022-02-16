package enums;

public enum Portal {

    PORTAL_REGISTRO("https://demoqa.com/automation-practice-form");

    String portal;

    private Portal(String url) {
        this.portal = url;
    }

    public String getPortal() {
        return portal;
    }
}
