package enums;

public enum TicketType implements Commented {

    BUG("high"),
    TASK("medium") {
        @Override
        public boolean isAssigned() {
            return true;
        }

        @Override
        public void comment(){
            System.out.println("comment");
        }
    },
    SUGGESTION("low");

    private String priority;

    TicketType(String priority) {
        this.priority = priority;
    }

    public boolean isAssigned() {
        return false;
    }

    public String getPriority() {
        return priority;
    }

    @Override
    public void comment() {
        System.out.println("Standard comment");
    }
}
