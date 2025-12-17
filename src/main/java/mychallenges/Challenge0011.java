package mychallenges;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

import static blch.framework.dsl.WireDsl.*;


@Challenge(id = "0011", name = "Too much information")
public class Challenge0011 extends ChallengeBase {

    @Override
    public void challenge() {
        args(
                v("PUT"),
                v("person"),
                v("Eve"),
                v("age"),
                v(22),
                v("email"),
                v("eve@example.com")
        );
        expected(
                v(true)
        );
    }
}
