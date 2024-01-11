package nc.it.chayutpong.newton_ice;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import nc.it.chayutpong.newton_ice.model.Camera;
import nc.it.chayutpong.newton_ice.repository.CameraRepository;
import nc.it.chayutpong.newton_ice.repository.EventRepository;

@SpringBootApplication
public class NewtonIceApplication implements CommandLineRunner {

	private final CameraRepository cameraRepository;

	public NewtonIceApplication(CameraRepository cameraRepository, EventRepository eventRepository) {
		this.cameraRepository = cameraRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(NewtonIceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Camera camera1 = new Camera("192.168.1.11", "Machine 1", "CAM-001");
		Camera camera2 = new Camera("192.168.1.12", "Machine 2", "CAM-002");
		cameraRepository.saveAll(Arrays.asList(camera1, camera2));
	}

}
