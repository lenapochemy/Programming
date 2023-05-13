public enum Features {

    GOODFRIEND("хороший друг"),
    FESTIVE("празднично убран"),
    FILLING("с ветчиной и сыром"),
    SMALL("маленькие"),
    APPETIZING("аппетитные"),
    BIRTHDAY("именинный"),
    PLEASANT("было очень приятно");

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
