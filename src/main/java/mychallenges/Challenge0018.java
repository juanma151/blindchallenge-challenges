package mychallenges;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

import static blch.framework.dsl.WireDsl.*;


@Challenge(id = "0018", name = "Back from the dead")
public class Challenge0018 extends ChallengeBase {

    @Override
    public void challenge() {
        args(
                v("GET"),
                v("person"),
                v("Alice")
        );
        expected(
                obj(
                        "name", v("Alice"),
                        "age", v(28)
                )
        );
    }
}

