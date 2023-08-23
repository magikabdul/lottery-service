package cloud.cholewa.lottery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.tools.agent.ReactorDebugAgent;

@SpringBootApplication(scanBasePackages = "cloud.cholewa")
public class LotteryServiceApplication {

    public static void main(String[] args) {
        ReactorDebugAgent.init();
        SpringApplication.run(LotteryServiceApplication.class, args);
    }
}
