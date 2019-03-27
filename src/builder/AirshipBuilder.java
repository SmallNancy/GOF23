package builder;

/**
 * @Author: Nancy
 * @Date: 2019/3/27 16:00
 */
public interface AirshipBuilder {
   Engine builderEngine();
   OrbitalModule builderOrbitalModel();
   EscapeTower builderEscapeTower();
}
