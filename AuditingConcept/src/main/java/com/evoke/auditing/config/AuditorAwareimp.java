package com.evoke.auditing.config;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class AuditorAwareimp implements AuditorAware<String> {

	@Override
	public Optional<String> getCurrentAuditor() {

		return Optional.of("neha pasupuleti");
	}

}
