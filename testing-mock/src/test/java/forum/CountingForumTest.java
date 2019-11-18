//package forum;
//
//import java.util.List;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.Assert.*;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//public class CountingForumTest {
//
//    @Test
//    public void testForumWithMock() {
//
//        //given
//        Statistics statisticsMock = mock(Statistics.class);
//        CountingForum forumStatistics = new CountingForum(statisticsMock);
//        List<String> users = new ArrayList<>();
//        users.add("Adam");
//        users.add("Ewa");
//
//
//        //when
//        when(statisticsMock.usersNames()).thenReturn(users);
//        when(statisticsMock.postsCount()).thenReturn(0);
//
//        Double averageOfPost = forumStatistics.avgPostPerUser;
//        //then
//        Assert.assertEquals(new Double(0), averageOfPost);
//    }
//
//    @Test
//    public void whenOneThousandPostThenAvgIsFiveHundred() {
//        //Given
//
//        Statistics statisticsMock = mock(Statistics.class);
//        CountingForum forumStatistics = new CountingForum(statisticsMock);
//
//        List<String> users = new ArrayList<>();
//        users.add("Adam");
//        users.add("Ewa");
//
//        when(statisticsMock.usersNames()).thenReturn(users);
//        when(statisticsMock.postsCount()).thenReturn(1000);
//
//        //When
//
//        Double averageOfPost = forumStatistics.avgPostPerUser;
//
//        //Then
//        Assert.assertEquals(new Double(500), averageOfPost);
//
//    }
//
//    @Test
//    public void whenZeroCommentsThenAvgIsZero() {
//        //Given
//
//        Statistics statisticsMock = mock(Statistics.class);
//        CountingForum forumStatistics = new CountingForum(statisticsMock);
//
//        List<String> users = new ArrayList<>();
//        users.add("Adam");
//        users.add("Ewa");
//
//        when(statisticsMock.usersNames()).thenReturn(users);
//        when(statisticsMock.commentsCount()).thenReturn(0);
//
//        //When
//
//        int averageOfComents = forumStatistics.commentsCounts;
//
//        //Then
//        Assert.assertEquals(0, averageOfComents);
//
//    }
//
//    @Test
//
//    public void whenCommentsPostIsHigherThanPost() {
//        //Given
//
//        Statistics statisticsMock = mock(Statistics.class);
//        CountingForum forumStatistics = new CountingForum(statisticsMock);
//
//        List<String> users = new ArrayList<>();
//        users.add("Adam");
//        users.add("Ewa");
//
//        when(statisticsMock.usersNames()).thenReturn(users);
//        when(statisticsMock.commentsCount()).thenReturn(20);
//        when(statisticsMock.postsCount()).thenReturn(10);
//        //When
//
//        Double commentsHighertThanPost = forumStatistics.getAvgCommentPerPost;
//
//        //Then
//        Assert.assertEquals(new Double(2), commentsHighertThanPost);
//
//    }
//
//    @Test
//    public void whenCommentsPostIsLowerThanPost() {
//        //Given
//
//        Statistics statisticsMock = mock(Statistics.class);
//        CountingForum forumStatistics = new CountingForum(statisticsMock);
//
//        List<String> users = new ArrayList<>();
//        users.add("Adam");
//        users.add("Ewa");
//
//        when(statisticsMock.usersNames()).thenReturn(users);
//        when(statisticsMock.commentsCount()).thenReturn(5);
//        when(statisticsMock.postsCount()).thenReturn(10);
//        //When
//
//        Double commentsLowerThanPost = forumStatistics.getAvgCommentPerPost;
//
//        //Then
//        Assert.assertEquals(new Double(0.5), commentsLowerThanPost);
//
//    }
//
//    @Test
//    public void whenZeroUsersThenAvgIsZero() {
//        //Given
//
//        Statistics statisticsMock = mock(Statistics.class);
//        CountingForum forumStatistics = new CountingForum(statisticsMock);
//
//        List<String> users = new ArrayList<>();
//
//        when(statisticsMock.usersNames()).thenReturn(users);
//
//        //When
//
//        int quantityOfUsers = forumStatistics.userCounts;
//
//        //Then
//
//        Assert.assertEquals(0, quantityOfUsers);
//    }
//
//    @Test
//    public void whenOneHundredUsersThenAvgIs() {
//        //Given
//
//        Statistics statisticsMock = mock(Statistics.class);
//        CountingForum forumStatistics = new CountingForum(statisticsMock);
//
//        List<String> users = new ArrayList<>();
//
//        for (int i = 0; i < 100; i++) {
//            users.add("Adam");
//        }
//        when(statisticsMock.usersNames()).thenReturn(users);
//        when(statisticsMock.postsCount()).thenReturn(300);
//        //When
//
//        Double averageOfPostPerOneHundredUsers = forumStatistics.avgPostPerUser;
//        //Then
//
//        Assert.assertEquals(new Double(3), averageOfPostPerOneHundredUsers);
//    }
//
//}