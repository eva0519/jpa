package com.sparta.jpa.repository;

import com.sparta.jpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

//    Spring Data JPA) 기본 제공해 주는 기능

//    // 1. 상품 생성
//Product product = new Product(...);
//productRepository.save(product);
//
//// 2. 상품 전체 조회
//List<Product> products = productRepository.findAll();
//
//// 3. 상품 전체 개수 조회
//long count = productRepository.count();
//
//// 4. 상품 삭제
//productRepository.delete(product);


//    ID 외의 필드에 대한 추가 기능은 interface 만 선언해 주면, 구현은 Spring Data JPA 가 대신!!

    // (1) 회원 ID 로 등록된 상품들 조회
    List<Product> findAllByUserId(Long userId);

    // (2) 상품명이 title 인 관심상품 1개 조회
    Product findByTitle(String title);

    // (3) 상품명에 word 가 포함된 모든 상품들 조회
    List<Product> findAllByTitleContaining(String word);

    // (4) 최저가가 fromPrice ~ toPrice 인 모든 상품들을 조회
    List<Product> findAllByLpriceBetween(int fromPrice, int toPrice);

//    공식 문서
//    https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods

}