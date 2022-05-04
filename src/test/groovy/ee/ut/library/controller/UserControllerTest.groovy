package ee.ut.library.controller


import ee.ut.project.service.UserService
import io.github.benas.randombeans.EnhancedRandomBuilder
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup

class UserControllerTest extends Specification {
    MockMvc mockMvc
    def userController
    def userService
    def enhancedRandom

    void setup() {
        enhancedRandom = EnhancedRandomBuilder.aNewEnhancedRandom()
        userService = Mock(UserService) as UserService
        userController = new UserController(userService)
        mockMvc = standaloneSetup(userController).build()
    }

    def "Get"() {
    }

    def "GetCurrent"() {
    }

    def "Insert"() {
    }

    def "Update"() {
    }

    def "Delete"() {
    }
}
