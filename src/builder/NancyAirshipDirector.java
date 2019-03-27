package builder;

/**
 * @Author: Nancy
 * @Date: 2019/3/27 16:10
 */
public class NancyAirshipDirector implements AirshipDirector {

    private  AirshipBuilder builder = new MyAirshipBuilder();

    public NancyAirshipDirector(AirshipBuilder builder) {
        this.builder = builder;
    }

    public AirshipBuilder getBuilder() {
        return builder;
    }



    @Override
    public Airship directAirship() {
        Engine e = builder.builderEngine();
        EscapeTower et = builder.builderEscapeTower();
        OrbitalModule o = builder.builderOrbitalModel();

        Airship a = new Airship();
        a.setEngine(e);
        a.setEscapeTower(et);
        a.setOrbitalModule(o);

        return a;
    }
}
