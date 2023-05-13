public enum Features {

    GOODFRIEND("хороший друг"),
    FESTIVE("празднично убран"),
    FILLING("с ветчиной и сыром"),
    SMALL("маленькие"),
    APPETIZING("аппетитные"),
    BIRTHDAY("именинный");

    private String feature;

    Features(String feature){
        this.feature = feature;
    }

    public String getFeatures() {
        return feature;
    }

    @Override
    public String toString() {
        return this.toString();
    }

}
