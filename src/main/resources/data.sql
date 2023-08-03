INSERT INTO `user` VALUES
                       (1,'admin','admin','admin@gmail.com','$2a$10$gqHrslMttQWSsDSVRTK1OehkkBiXsJ/a4z2OURU./dizwOQu5Lovu','admin'),
                       (2,'test','test','test@gmail.com','$2a$12$TYSPPDsgR1T9vpgMSavOteZoqzjGVLt7rzsqKLrGL4oQdE3rWDNru','test');

INSERT INTO `role` VALUES (1,'ROLE_ADMIN'),(2,'ROLE_USER');

INSERT INTO `user_role` VALUES (1,1),(2,2);

