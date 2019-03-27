package builder;

/**
 * @Author: Nancy
 * @Date: 2019/3/27 16:04
 */
public class MyAirshipBuilder implements AirshipBuilder {

    @Override
    public Engine builderEngine() {
        System.out.println("nancy airship engine");
        return new Engine("nancy airship engine");
    }

    @Override
    public OrbitalModule builderOrbitalModel() {
        System.out.println("nancy's orbital module");
        return new OrbitalModule("nancy's orbital module");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("nancy's escapeTower");
        return new EscapeTower("nancy's escapeTower");
    }
}
