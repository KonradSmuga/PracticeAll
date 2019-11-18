package forum;

public class CountingForum {



    Statistics statistics;
    int userCounts;
    int postCounts;
    int commentsCounts;
    double avgPostPerUser;
    double avgCommentPerUser;
    double getAvgCommentPerPost;
public CountingForum(Statistics statistics){

}
    public Statistics calculateAdvStatistics(Statistics statistics) {
        userCounts = statistics.usersNames().size();
        postCounts = statistics.postsCount();
        commentsCounts = statistics.commentsCount();

        avgCommentPerUser = userCounts / commentsCounts;
        avgPostPerUser = userCounts / postCounts;
        getAvgCommentPerPost = userCounts / postCounts;

        return statistics;
    }


}
