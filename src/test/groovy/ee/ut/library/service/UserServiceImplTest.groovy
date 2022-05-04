package ee.ut.library.service

import ee.ut.project.repository.UserRepository
import ee.ut.project.service.impl.UserServiceImpl
import io.github.benas.randombeans.EnhancedRandomBuilder
import spock.lang.Specification

class UserServiceImplTest extends Specification {
    def userRepository
    def userService
    def enhancedRandom

    void setup() {
        userRepository = Mock(UserRepository) as UserRepository
        enhancedRandom = EnhancedRandomBuilder.aNewEnhancedRandom()
        userService = new UserServiceImpl(userRepository)
    }

    def "GetAll should return the list of users"() {
        given:
        def user1 = enhancedRandom.nextObject(User)
        def user2 = enhancedRandom.nextObject(User)
        def response = Arrays.asList(user1, user2)

        when:
        def res = userService.getAll()

        then:
        res.size() == 2

        1 * userRepository.findAll() >> response
        0 * _._
    }

    def "Get"() {
    }

    def "Insert"() {
    }

    def "Update"() {
    }

    def "Delete"() {
    }
}
