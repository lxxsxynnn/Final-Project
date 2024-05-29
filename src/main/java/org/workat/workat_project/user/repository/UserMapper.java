package org.workat.workat_project.user.repository;

import org.apache.ibatis.annotations.Mapper;
import org.workat.workat_project.user.entity.UserDetailDTO;
import org.workat.workat_project.user.entity.UserListDTO;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserListDTO> getUserList();
    UserDetailDTO getUserDetail(int user_id);
}