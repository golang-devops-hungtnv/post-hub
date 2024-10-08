package org.example.security;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.example.domain.exception.PermissionDeniedException;
import org.example.domain.user.User;
import org.example.port.repository.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SecurityUserService implements UserDetailsService {
    private final UserRepository userRepository;

    private static final String ANONYMOUS_USER = "anonymousUser";

    @SneakyThrows
    public static User getCurrentUser() {
        var principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (ANONYMOUS_USER.equals(principal)) throw new PermissionDeniedException();
        var securityUser = (SecurityUser) principal;

        return securityUser.getUser();
    }

    @SneakyThrows
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //        var user =
        //
        // this.userRepository.findByUsername(username).orElseThrow(EntityNotFoundException::new);
        return SecurityUser.build(new User());
    }
}