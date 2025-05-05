package me.moamenhredeen.connect.post;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/post")
@Produces(MediaType.APPLICATION_JSON)
public class PostResource {

    @GET
    public List<PostResponse> getPosts(){
        return Post.<Post>findAll().stream()
                .map(el -> new PostResponse(el.id, el.title, el.content, el.createdAt, el.updatedAt))
                .toList();
    }

    @GET
    @Path("/{id}")
    public PostResponse getPostById(@PathParam("id") long id){
        var post =  Post.<Post>findById(id);
        if(post == null) {
            return null;
        }
        return new PostResponse(post.id, post.title, post.content, post.createdAt, post.updatedAt);
    }
}
