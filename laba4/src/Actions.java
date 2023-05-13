public enum Actions {

    THINK("подумал что"),
    INVITE("пригласил к"),
    BRING("принесла"),
    FLAUNT("красовался на"),
    TAKE("взяла"),
    SPILL("разливает"),
    SIT_DOWN("сел за"),
    SCREAM("закричал"),
    COME("пришел"),
    MEET("бросился на встречу"),
    WANT("очень хотел, чтобы"),
    RING("раздался"),
    TREAT("стала угощать");

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
