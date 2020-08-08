/*
 * package com.cts.pss.secconfig;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.crypto.password.NoOpPasswordEncoder; import
 * org.springframework.security.crypto.password.PasswordEncoder;
 * 
 * @SuppressWarnings("deprecation")
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class SecurityConfig extends
 * WebSecurityConfigurerAdapter{
 * 
 * @Autowired private UserDetailsService userDetailsService;
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception { auth.userDetailsService(userDetailsService); }
 * 
 * // .antMatchers("/admin").hasRole("ADMIN")
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.authorizeRequests()
 * .antMatchers("/bookpassenger").hasAnyRole("ADMIN","USER")
 * .antMatchers("/checkininformation").hasAnyRole("ADMIN","USER")
 * .antMatchers("/searchFlight").permitAll()
 * .antMatchers("/flightList").permitAll()
 * .antMatchers("/bookticket").permitAll()
 * .antMatchers("/flightListorder").permitAll()
 * .antMatchers("/registerform").permitAll()
 * .antMatchers("/checkin").permitAll() .antMatchers("/view/flight").permitAll()
 * .antMatchers("/view/flightlist").permitAll()
 * .antMatchers("/view/order/flightlist").permitAll()
 * .antMatchers("/").permitAll().and() .formLogin(); }
 * 
 * @SuppressWarnings("deprecation")
 * 
 * @Bean public PasswordEncoder pwdEncoder() { return
 * NoOpPasswordEncoder.getInstance(); } }
 */