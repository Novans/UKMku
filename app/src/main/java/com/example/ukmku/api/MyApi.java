package com.example.ukmku.api;

import com.example.ukmku.model.Group;
import com.example.ukmku.model.Investor;
import com.example.ukmku.model.Login;
import com.example.ukmku.model.Owner;
import com.example.ukmku.model.Register;
import com.example.ukmku.model.Report;
import com.example.ukmku.model.Sell;
import com.example.ukmku.model.Transaction;
import com.example.ukmku.model.User;
import com.example.ukmku.response.BuyResponse;
import com.example.ukmku.response.GroupHistoryResponse;
import com.example.ukmku.response.GroupResponse;
import com.example.ukmku.response.InvestorResponse;
import com.example.ukmku.response.NewsResponse;
import com.example.ukmku.response.OwnerResponse;
import com.example.ukmku.response.ReadAllUsersResponse;
import com.example.ukmku.response.RegisterResponse;
import com.example.ukmku.response.BusinessTypeResponse;
import com.example.ukmku.response.EducationsResponse;
import com.example.ukmku.response.LoginResponse;
import com.example.ukmku.response.ReportResponse;
import com.example.ukmku.response.SellResponse;
import com.example.ukmku.response.TrainingResponse;
import com.example.ukmku.response.UpdateUserResponse;
import com.example.ukmku.response.VideoOrAudioResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface MyApi {

    //USER
    //Register
    @POST("/register")
    Call<RegisterResponse> register(@Body Register user);

    @POST("/login")
    Call<LoginResponse> login(@Body Login login);

    @POST("/users/:userId/investors")
    Call<InvestorResponse> investor(
            @Header("Authorization") String authorization,
            @Body Investor investor
            );

    @POST("/users/:userId/owners")
    Call<OwnerResponse> owner(
            @Header("Authorization") String authorization,
            @Body Owner owner
            );

    @POST("/owners/:ownerId/reports")
    Call<ReportResponse> uploadReport(
            @Header("Authorization") String authorization,
            @Body Report report
            );

    @POST("/users/:userId/buying")
    Call<BuyResponse> buy(
            @Header("Authorization") String authorization,
            @Body Transaction transaction
            );

    @POST("/users/:userId/selling")
    Call<SellResponse> sell(
            @Header("Authorization") String authorization,
            @Body Sell sell
            );

    @GET("/business-types")
    Call<BusinessTypeResponse> getBusinessType();

    @GET("/educations")
    Call<EducationsResponse> getEducations();

    @GET("/users")
    Call<ReadAllUsersResponse> readAllUsers();

    @GET("/users/:userId")
    Call<ReadAllUsersResponse> readAUser();

    @GET("/users/:userId/investors/:userId")
    Call<InvestorResponse> readOneInvestor();

    @GET("/users/:userId/owners/:investorId")
    Call<OwnerResponse> readOneOwner();

    @GET("/trainings")
    Call<TrainingResponse> getAllTraining(
            @Header("Authorization") String authorization
    );

    @GET("/trainings/:trainingId/video/:videoId")
    Call<VideoOrAudioResponse> getVideoOrAudio(
            @Header("Authorization") String authorization
    );

    @GET("/news")
    Call<NewsResponse> getAllNews(
            @Header("Authorization") String authorization
    );

    @GET("/news/:newsId")
    Call<NewsResponse> getOneNews(
            @Header("Authorization") String authorization
    );

    @GET("/news/:newsId/image/:imageId")
    Call<VideoOrAudioResponse> getImage(
            @Header("Authorization") String authorization
    );

    @GET("/groups")
    Call<GroupResponse> getAllGroups();

    @GET("/groups/:groupId")
    Call<GroupResponse> getOneGroup();

    @GET("/groups/:groupId/histories")
    Call<GroupHistoryResponse> getAllGroupHistories();

    @GET("/groups/:groupId")
    Call<Group> getOneGroupHistory();

    @PUT("/users/:userId")
    Call<UpdateUserResponse> updateUser(
            @Header("Authorization") String authorization,
            @Body User updateUser
            );

    @PUT("/users/:userId/investors/:userId")
    Call<InvestorResponse> updateInvestor(
            @Header("Authorization") String authorization,
            @Body Investor updateInvestor
    );

    @PUT("/users/:userId/owners/:investorId")
    Call<OwnerResponse> updateOwner(
            @Header("Authorization") String authorization,
            @Body Owner updateOwner
    );

    @DELETE("/users/:userId")
    Call<UpdateUserResponse> deleteUser(
            @Header("Authorization") String authorization
    );

}
