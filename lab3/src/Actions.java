public enum Actions {

    THINK("подумал"),
    INVITE("пригласил к"),
    BRING("принесла"),
    FLAUNT("красовался на"),
    TAKE("взяла"),
    SPILL("разливает");

    private String action;

    Actions(String action){
        this.action = action;
    }

    public String getActions(){
        return action;
    }

    @Override
    public String toString(){
        return this.toString();
    }
}
