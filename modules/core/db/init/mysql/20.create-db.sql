-- begin YSUKU_CATEGORY
alter table YSUKU_CATEGORY add constraint FK_YSUKU_CATEGORY_PARENT_CATEGORY foreign key (PARENT_CATEGORY_ID) references YSUKU_CATEGORY(ID)^
create index IDX_YSUKU_CATEGORY_PARENT_CATEGORY on YSUKU_CATEGORY (PARENT_CATEGORY_ID)^
-- end YSUKU_CATEGORY
-- begin YSUKU_BOOK
alter table YSUKU_BOOK add constraint FK_YSUKU_BOOK_CATEGORY foreign key (CATEGORY_ID) references YSUKU_CATEGORY(ID)^
alter table YSUKU_BOOK add constraint FK_YSUKU_BOOK_AUTHOR foreign key (AUTHOR_ID) references YSUKU_AUTHOR(ID)^
alter table YSUKU_BOOK add constraint FK_YSUKU_BOOK_PUBLISHER foreign key (PUBLISHER_ID) references YSUKU_PUBLISHER(ID)^
create index IDX_YSUKU_BOOK_CATEGORY on YSUKU_BOOK (CATEGORY_ID)^
create index IDX_YSUKU_BOOK_AUTHOR on YSUKU_BOOK (AUTHOR_ID)^
create index IDX_YSUKU_BOOK_PUBLISHER on YSUKU_BOOK (PUBLISHER_ID)^
-- end YSUKU_BOOK
-- begin YSUKU_ADDRESS
alter table YSUKU_ADDRESS add constraint FK_YSUKU_ADDRESS_USER foreign key (USER_ID) references YSUKU_USER(ID)^
create index IDX_YSUKU_ADDRESS_USER on YSUKU_ADDRESS (USER_ID)^
-- end YSUKU_ADDRESS
-- begin YSUKU_ORDER
alter table YSUKU_ORDER add constraint FK_YSUKU_ORDER_USER foreign key (USER_ID) references YSUKU_USER(ID)^
alter table YSUKU_ORDER add constraint FK_YSUKU_ORDER_ADDRESS foreign key (ADDRESS_ID) references YSUKU_ADDRESS(ID)^
create index IDX_YSUKU_ORDER_USER on YSUKU_ORDER (USER_ID)^
create index IDX_YSUKU_ORDER_ADDRESS on YSUKU_ORDER (ADDRESS_ID)^
-- end YSUKU_ORDER
-- begin YSUKU_ORDER_DETAIL
alter table YSUKU_ORDER_DETAIL add constraint FK_YSUKU_ORDER_DETAIL_ORDER foreign key (ORDER_ID) references YSUKU_ORDER(ID)^
alter table YSUKU_ORDER_DETAIL add constraint FK_YSUKU_ORDER_DETAIL_BOOK foreign key (BOOK_ID) references YSUKU_BOOK(ID)^
create index IDX_YSUKU_ORDER_DETAIL_ORDER on YSUKU_ORDER_DETAIL (ORDER_ID)^
create index IDX_YSUKU_ORDER_DETAIL_BOOK on YSUKU_ORDER_DETAIL (BOOK_ID)^
-- end YSUKU_ORDER_DETAIL
