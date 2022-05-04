package ee.ut.library.repository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import spock.lang.Specification

@DataJpaTest
class UserRepositoryTest extends Specification {
    @Autowired
    UserRepository userRepository

    def "FindByCognitoUsername"() {
    }
}
