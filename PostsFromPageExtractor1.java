import facebook4j.Comment;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.PagableList;
import facebook4j.Post;
import facebook4j.Reading;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;

 public class PostsFromPageExtractor1{

/**
 * A simple Facebook4J client which
 * illustrates how to access group feeds / posts / comments.
 * 
 * @param args
 * @throws FacebookException 
 */
public static void main(String[] args) throws FacebookException {

    // Generate facebook instance.
    Facebook facebook = new FacebookFactory().getInstance();
    // Use default values for oauth app id.
    facebook.setOAuthAppId("1266736243431865","56431e98014703cf9d6e6186511f19f6");
    // Get an access token from: 
    // https://developers.facebook.com/tools/explorer
    // Copy and paste it below.
    String accessTokenString ="EAACEdEose0cBAGzZAdHhlj8C1hoi81QsZA7l9GqY3ZBiNaSEfh8Rxfgr39RLCVlRRV2fxv23ThTDiCdf4oNZC679PJiwxq4d0ZCDdrYpDjyUaDx8bHTtN1BZApGZA0cd41hgfDfwMdqSAMuXmyfKPkkcQz22HEk4u6iYoTohe9elTWW533PRSkvZBDjLg4rJgqkZD";
    AccessToken at = new AccessToken(accessTokenString);
    // Set access token.
    facebook.setOAuthAccessToken(at);

    // We're done.
    // Access group feeds.
    // You can get the group ID from:
    // https://developers.facebook.com/tools/explorer

    // Set limit to 25 feeds.
    /*ResponseList<Post> feeds = facebook.getFeed("187446750783",
            new Reading().limit(25));

        // For all 25 feeds...
        for (int i = 0; i < feeds.size(); i++) {
            // Get post.
            Post post = feeds.get(i);
            // Get (string) message.
            String message = post.getMessage();
                            // Print out the message.
            System.out.println(message);

            // Get more stuff...
            PagableList<Comment> comments = post.getComments();
            String date = post.getCreatedTime().toString();
            String name = post.getFrom().getName();
            String id = post.getId();
        } */
        facebook.postStatusMessage("Hello World from Facebook4J.");          
    }
}