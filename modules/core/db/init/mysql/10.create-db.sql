-- begin YSUKU_CATEGORY
create table YSUKU_CATEGORY (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    DESCRIPTION longtext,
    PARENT_CATEGORY_ID varchar(32),
    --
    primary key (ID)
)^
-- end YSUKU_CATEGORY
-- begin YSUKU_BOOK
create table YSUKU_BOOK (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    CATEGORY_ID varchar(32),
    AUTHOR_ID varchar(32),
    PUBLISHER_ID varchar(32),
    ISBN varchar(255),
    SALE_PRICE decimal(19, 2),
    PURCHASE_PRICE decimal(19, 2),
    DISCOUNT_PRICE decimal(19, 2),
    PAGE_COUNT integer,
    WORD_COUNT integer,
    PUBLISH_DATE date,
    PRINT_DATE date,
    DESCRIPTION longtext,
    MEMO longtext,
    --
    primary key (ID)
)^
-- end YSUKU_BOOK
-- begin YSUKU_ADDRESS
create table YSUKU_ADDRESS (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    USER_ID varchar(32),
    RECEIVER varchar(255),
    PROVINCE varchar(255),
    CITY varchar(255),
    ADDRESS varchar(255),
    MEMO longtext,
    --
    primary key (ID)
)^
-- end YSUKU_ADDRESS
-- begin YSUKU_USER
create table YSUKU_USER (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    PASSWORD longtext,
    GENDER integer,
    MOBILE varchar(255),
    EMAIL varchar(255),
    BIRTHDAY date,
    MEMO longtext,
    --
    primary key (ID)
)^
-- end YSUKU_USER
-- begin YSUKU_PUBLISHER
create table YSUKU_PUBLISHER (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    NAME_EN varchar(255),
    ADDRESS longtext,
    DESCRIPTION longtext,
    MEMO longtext,
    --
    primary key (ID)
)^
-- end YSUKU_PUBLISHER
-- begin YSUKU_AUTHOR
create table YSUKU_AUTHOR (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    DESCRIPTION longtext,
    MEMO longtext,
    --
    primary key (ID)
)^
-- end YSUKU_AUTHOR
-- begin YSUKU_ORDER
create table YSUKU_ORDER (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    CODE varchar(255),
    USER_ID varchar(32),
    ADDRESS_ID varchar(32),
    PAY_TYPE integer,
    INVOICE_TYPE integer,
    MEMO longtext,
    --
    primary key (ID)
)^
-- end YSUKU_ORDER
-- begin YSUKU_ORDER_DETAIL
create table YSUKU_ORDER_DETAIL (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    ORDER_ID varchar(32),
    TYPE_ integer,
    BOOK_ID varchar(32),
    UNIT_PRICE decimal(19, 2),
    AMOUNT integer,
    MEMO longtext,
    --
    primary key (ID)
)^
-- end YSUKU_ORDER_DETAIL
