package nc.it.chayutpong.newton_ice.repository;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import nc.it.chayutpong.newton_ice.model.Camera;

public interface CameraRepository extends CrudRepository<Camera, Integer>{
    List<Camera> findByIpAdress(String ipAdress);
    List<Camera> findByLocation(String location);
}
