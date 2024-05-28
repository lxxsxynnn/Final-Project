package org.workat.workat_project.review.repository;

import org.apache.ibatis.annotations.Mapper;
import org.workat.workat_project.review.entity.ReplyVO;
import org.workat.workat_project.review.entity.ReviewVO;

import java.util.List;

@Mapper
public interface ReviewMapper {
    List<ReviewVO> getReviewInfo(int placeId);

    ReplyVO getReply(int reviewId);
}