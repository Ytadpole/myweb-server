package pers.yangs.myweb.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import pers.yangs.myweb.entity.User;

/**
 * @author yangs
 */
public class JWTUtils {

    public static String generateToken(User user){
        return JWT.create().withAudience(user.getId()+"")
                .sign(Algorithm.HMAC256(user.getPassword()));
    }
}
