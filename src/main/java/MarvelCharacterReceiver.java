import com.receiver.character.marvel.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication ( scanBasePackageClasses = {AppConfig.class} )
@EnableKafka
public class MarvelCharacterReceiver {

    public static void main(String[] args) {
        SpringApplication.run(MarvelCharacterReceiver.class, args);
    }


}
