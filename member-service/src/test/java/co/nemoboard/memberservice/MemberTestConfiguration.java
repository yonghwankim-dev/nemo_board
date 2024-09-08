package co.nemoboard.memberservice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"co.nemoboard.memberservice", "co.nemoboard.nemoboardcommon"})
public class MemberTestConfiguration {
}
