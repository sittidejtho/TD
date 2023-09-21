create table SKUS(
  BARCODE varchar(100) not null,
  PRODUCTNAME varchar(100) not null,
  PRICE double not null,
  PRIMARY KEY ( BARCODE )
);

create table PROMOTIONS(
  PROMOTION_CODE varchar(100) not null,
  PROMOTION_TYPE varchar(100) not null,
  NUMBER_OF_ITEM_TO_BE_APPLIED integer not null,
  BARCODE varchar(100) not null,
  DISCOUNT_PER_UNIT integer not null,
  LIMIT_PER_BILL integer not null,
  PRIMARY KEY ( PROMOTION_CODE, BARCODE )
);
