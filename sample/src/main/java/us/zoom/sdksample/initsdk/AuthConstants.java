package us.zoom.sdksample.initsdk;

public interface AuthConstants {

	// TODO Change it to your web domain
	public final static String WEB_DOMAIN = "zoom.us";

	/**
	 * We recommend that, you can generate jwttoken on your own server instead of hardcore in the code.
	 * We hardcore it here, just to run the demo.
	 *
	 * You can generate a jwttoken on the https://jwt.io/
	 * with this payload:
	 * {
	 *
	 *     "appKey": "string", // app key
	 *     "iat": long, // access token issue timestamp
	 *     "exp": long, // access token expire time
	 *     "tokenExp": long // token expire time
	 * }
	 */
	public final static String SDK_JWTTOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhcHBLZXkiOiJ4TWdZbm5iS1lXSkU3ZkJ2R2o1QWtZMFAwcjZvcjJ1cWZTa2siLCJpYXQiOjE2MDc4NzIyMjgsImV4cCI6MTYwNzkxNTQyOCwidG9rZW5FeHAiOjE4MDB9.Avml3FzcVz7SOThmzImQ7YysyiRn3z3kXSgcLUfnVvc";

}
