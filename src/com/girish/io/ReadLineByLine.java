����   2 j  com/girish/HashSet/Test1  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lcom/girish/HashSet/Test1; main ([Ljava/lang/String;)V  java/util/ArrayList
  	
    java/lang/Integer   valueOf (I)Ljava/lang/Integer;
     add (Ljava/lang/Object;)Z	     java/lang/System ! " out Ljava/io/PrintStream; $ java/lang/StringBuilder
 # 	
 # ' ( ) append -(Ljava/lang/Object;)Ljava/lang/StringBuilder; +  : original array list
 # - ( . -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 # 0 1 2 toString ()Ljava/lang/String;
 4 6 5 java/io/PrintStream 7 8 println (Ljava/lang/String;)V : java/util/TreeSet
 9 	
  = > ? iterator ()Ljava/util/Iterator; A C B java/util/Iterator D E next ()Ljava/lang/Object; G I H java/util/Set J  contains G  A M N O hasNext ()Z Q  :arraylist of duplicats  
 4 S T 8 print
 4 V 7  X  : set of values args [Ljava/lang/String; al Ljava/util/ArrayList; ss Ljava/util/Set; a itr Ljava/util/Iterator; o Ljava/lang/Object; b Z StackMapTable Z 
SourceFile 
Test1.java !               /     *� �    
                    	      �    � Y� L+
� � W+� � W+� � W+� � W+� � W+� � W+� � W+� � W+� � W� � #Y� %+� &*� ,� /� 3� 9Y� ;M� Y� N+� <:� .� @ :,� F 6� ,� K W� 
-� W� L ��β � #Y� %-� &P� ,� /� R� � U� � #Y� %,� &W� ,� /� R�    
   f           &  0  :  D  N  X  b  {  �  �  �  �   � ! � " � # � % �  � ' � ( � * +    H    Y Z    � [ \  �  ] ^  � w _ \  � q ` a  � " b c  �  d e  f   " � �  g  G  A  � # �   h    i                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 