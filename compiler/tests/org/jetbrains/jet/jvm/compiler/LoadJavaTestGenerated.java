/*
 * Copyright 2010-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.jet.jvm.compiler;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.jvm.compiler.AbstractLoadJavaTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.GenerateTests}. DO NOT MODIFY MANUALLY */
@TestMetadata("compiler/testData/loadJava")
@InnerTestClasses({LoadJavaTestGenerated.Annotation.class, LoadJavaTestGenerated.Constructor.class, LoadJavaTestGenerated.JavaBean.class, LoadJavaTestGenerated.KotlinSignature.class, LoadJavaTestGenerated.Library.class, LoadJavaTestGenerated.Modality.class, LoadJavaTestGenerated.NotNull.class, LoadJavaTestGenerated.Vararg.class})
public class LoadJavaTestGenerated extends AbstractLoadJavaTest {
    public void testAllFilesPresentInLoadJava() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/loadJava"), "java", true);
    }
    
    @TestMetadata("ArrayTypeVariance.java")
    public void testArrayTypeVariance() throws Exception {
        doTest("compiler/testData/loadJava/ArrayTypeVariance.java");
    }
    
    @TestMetadata("ClassDoesNotOverrideMethod.java")
    public void testClassDoesNotOverrideMethod() throws Exception {
        doTest("compiler/testData/loadJava/ClassDoesNotOverrideMethod.java");
    }
    
    @TestMetadata("ClassWithTypeP.java")
    public void testClassWithTypeP() throws Exception {
        doTest("compiler/testData/loadJava/ClassWithTypeP.java");
    }
    
    @TestMetadata("ClassWithTypePExtendsIterableP.java")
    public void testClassWithTypePExtendsIterableP() throws Exception {
        doTest("compiler/testData/loadJava/ClassWithTypePExtendsIterableP.java");
    }
    
    @TestMetadata("ClassWithTypePP.java")
    public void testClassWithTypePP() throws Exception {
        doTest("compiler/testData/loadJava/ClassWithTypePP.java");
    }
    
    @TestMetadata("ClassWithTypePRefNext.java")
    public void testClassWithTypePRefNext() throws Exception {
        doTest("compiler/testData/loadJava/ClassWithTypePRefNext.java");
    }
    
    @TestMetadata("ClassWithTypePRefSelf.java")
    public void testClassWithTypePRefSelf() throws Exception {
        doTest("compiler/testData/loadJava/ClassWithTypePRefSelf.java");
    }
    
    @TestMetadata("FieldAsVar.java")
    public void testFieldAsVar() throws Exception {
        doTest("compiler/testData/loadJava/FieldAsVar.java");
    }
    
    @TestMetadata("FieldOfArrayType.java")
    public void testFieldOfArrayType() throws Exception {
        doTest("compiler/testData/loadJava/FieldOfArrayType.java");
    }
    
    @TestMetadata("FinalFieldAsVal.java")
    public void testFinalFieldAsVal() throws Exception {
        doTest("compiler/testData/loadJava/FinalFieldAsVal.java");
    }
    
    @TestMetadata("InnerClass.java")
    public void testInnerClass() throws Exception {
        doTest("compiler/testData/loadJava/InnerClass.java");
    }
    
    @TestMetadata("InnerClassReferencesOuterTP.java")
    public void testInnerClassReferencesOuterTP() throws Exception {
        doTest("compiler/testData/loadJava/InnerClassReferencesOuterTP.java");
    }
    
    @TestMetadata("InnerClassesInGeneric.java")
    public void testInnerClassesInGeneric() throws Exception {
        doTest("compiler/testData/loadJava/InnerClassesInGeneric.java");
    }
    
    @TestMetadata("MethodReferencesOuterClassTP.java")
    public void testMethodReferencesOuterClassTP() throws Exception {
        doTest("compiler/testData/loadJava/MethodReferencesOuterClassTP.java");
    }
    
    @TestMetadata("MethodTypePOneUpperBound.java")
    public void testMethodTypePOneUpperBound() throws Exception {
        doTest("compiler/testData/loadJava/MethodTypePOneUpperBound.java");
    }
    
    @TestMetadata("MethodTypePTwoUpperBounds.java")
    public void testMethodTypePTwoUpperBounds() throws Exception {
        doTest("compiler/testData/loadJava/MethodTypePTwoUpperBounds.java");
    }
    
    @TestMetadata("MethodWithTypeP.java")
    public void testMethodWithTypeP() throws Exception {
        doTest("compiler/testData/loadJava/MethodWithTypeP.java");
    }
    
    @TestMetadata("MethodWithTypePP.java")
    public void testMethodWithTypePP() throws Exception {
        doTest("compiler/testData/loadJava/MethodWithTypePP.java");
    }
    
    @TestMetadata("MethodWithTypePRefClassP.java")
    public void testMethodWithTypePRefClassP() throws Exception {
        doTest("compiler/testData/loadJava/MethodWithTypePRefClassP.java");
    }
    
    @TestMetadata("MethosWithPRefTP.java")
    public void testMethosWithPRefTP() throws Exception {
        doTest("compiler/testData/loadJava/MethosWithPRefTP.java");
    }
    
    @TestMetadata("MyException.java")
    public void testMyException() throws Exception {
        doTest("compiler/testData/loadJava/MyException.java");
    }
    
    @TestMetadata("Simple.java")
    public void testSimple() throws Exception {
        doTest("compiler/testData/loadJava/Simple.java");
    }
    
    @TestMetadata("TwoFields.java")
    public void testTwoFields() throws Exception {
        doTest("compiler/testData/loadJava/TwoFields.java");
    }
    
    @TestMetadata("compiler/testData/loadJava/annotation")
    public static class Annotation extends AbstractLoadJavaTest {
        public void testAllFilesPresentInAnnotation() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/loadJava/annotation"), "java", true);
        }
        
        @TestMetadata("AnnotatedAnnotation.java")
        public void testAnnotatedAnnotation() throws Exception {
            doTest("compiler/testData/loadJava/annotation/AnnotatedAnnotation.java");
        }
        
        @TestMetadata("AnnotatedMethod.java")
        public void testAnnotatedMethod() throws Exception {
            doTest("compiler/testData/loadJava/annotation/AnnotatedMethod.java");
        }
        
        @TestMetadata("SimpleAnnotation.java")
        public void testSimpleAnnotation() throws Exception {
            doTest("compiler/testData/loadJava/annotation/SimpleAnnotation.java");
        }
        
    }
    
    @TestMetadata("compiler/testData/loadJava/constructor")
    public static class Constructor extends AbstractLoadJavaTest {
        public void testAllFilesPresentInConstructor() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/loadJava/constructor"), "java", true);
        }
        
        @TestMetadata("ConstructorGenericDeep.java")
        public void testConstructorGenericDeep() throws Exception {
            doTest("compiler/testData/loadJava/constructor/ConstructorGenericDeep.java");
        }
        
        @TestMetadata("ConstructorGenericSimple.java")
        public void testConstructorGenericSimple() throws Exception {
            doTest("compiler/testData/loadJava/constructor/ConstructorGenericSimple.java");
        }
        
        @TestMetadata("ConstructorGenericUpperBound.java")
        public void testConstructorGenericUpperBound() throws Exception {
            doTest("compiler/testData/loadJava/constructor/ConstructorGenericUpperBound.java");
        }
        
    }
    
    @TestMetadata("compiler/testData/loadJava/javaBean")
    public static class JavaBean extends AbstractLoadJavaTest {
        public void testAllFilesPresentInJavaBean() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/loadJava/javaBean"), "java", true);
        }
        
        @TestMetadata("DifferentGetterAndSetter.java")
        public void testDifferentGetterAndSetter() throws Exception {
            doTest("compiler/testData/loadJava/javaBean/DifferentGetterAndSetter.java");
        }
        
        @TestMetadata("JavaBeanAbstractGetter.java")
        public void testJavaBeanAbstractGetter() throws Exception {
            doTest("compiler/testData/loadJava/javaBean/JavaBeanAbstractGetter.java");
        }
        
        @TestMetadata("JavaBeanVal.java")
        public void testJavaBeanVal() throws Exception {
            doTest("compiler/testData/loadJava/javaBean/JavaBeanVal.java");
        }
        
        @TestMetadata("JavaBeanVar.java")
        public void testJavaBeanVar() throws Exception {
            doTest("compiler/testData/loadJava/javaBean/JavaBeanVar.java");
        }
        
        @TestMetadata("JavaBeanVarOfGenericType.java")
        public void testJavaBeanVarOfGenericType() throws Exception {
            doTest("compiler/testData/loadJava/javaBean/JavaBeanVarOfGenericType.java");
        }
        
        @TestMetadata("TwoSetters.java")
        public void testTwoSetters() throws Exception {
            doTest("compiler/testData/loadJava/javaBean/TwoSetters.java");
        }
        
    }
    
    @TestMetadata("compiler/testData/loadJava/kotlinSignature")
    @InnerTestClasses({KotlinSignature.Error.class, KotlinSignature.Propagation.class})
    public static class KotlinSignature extends AbstractLoadJavaTest {
        public void testAllFilesPresentInKotlinSignature() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/loadJava/kotlinSignature"), "java", true);
        }
        
        @TestMetadata("ConstructorWithNewTypeParams.java")
        public void testConstructorWithNewTypeParams() throws Exception {
            doTest("compiler/testData/loadJava/kotlinSignature/ConstructorWithNewTypeParams.java");
        }
        
        @TestMetadata("ConstructorWithParentTypeParams.java")
        public void testConstructorWithParentTypeParams() throws Exception {
            doTest("compiler/testData/loadJava/kotlinSignature/ConstructorWithParentTypeParams.java");
        }
        
        @TestMetadata("ConstructorWithSeveralParams.java")
        public void testConstructorWithSeveralParams() throws Exception {
            doTest("compiler/testData/loadJava/kotlinSignature/ConstructorWithSeveralParams.java");
        }
        
        @TestMetadata("ConstructorWithoutParams.java")
        public void testConstructorWithoutParams() throws Exception {
            doTest("compiler/testData/loadJava/kotlinSignature/ConstructorWithoutParams.java");
        }
        
        @TestMetadata("MethodWithFunctionTypes.java")
        public void testMethodWithFunctionTypes() throws Exception {
            doTest("compiler/testData/loadJava/kotlinSignature/MethodWithFunctionTypes.java");
        }
        
        @TestMetadata("MethodWithGenerics.java")
        public void testMethodWithGenerics() throws Exception {
            doTest("compiler/testData/loadJava/kotlinSignature/MethodWithGenerics.java");
        }
        
        @TestMetadata("MethodWithMappedClasses.java")
        public void testMethodWithMappedClasses() throws Exception {
            doTest("compiler/testData/loadJava/kotlinSignature/MethodWithMappedClasses.java");
        }
        
        @TestMetadata("MethodWithTypeParameters.java")
        public void testMethodWithTypeParameters() throws Exception {
            doTest("compiler/testData/loadJava/kotlinSignature/MethodWithTypeParameters.java");
        }
        
        @TestMetadata("MethodWithVararg.java")
        public void testMethodWithVararg() throws Exception {
            doTest("compiler/testData/loadJava/kotlinSignature/MethodWithVararg.java");
        }
        
        @TestMetadata("PropertyArrayTypes.java")
        public void testPropertyArrayTypes() throws Exception {
            doTest("compiler/testData/loadJava/kotlinSignature/PropertyArrayTypes.java");
        }
        
        @TestMetadata("PropertyComplexTypes.java")
        public void testPropertyComplexTypes() throws Exception {
            doTest("compiler/testData/loadJava/kotlinSignature/PropertyComplexTypes.java");
        }
        
        @TestMetadata("PropertySimpleType.java")
        public void testPropertySimpleType() throws Exception {
            doTest("compiler/testData/loadJava/kotlinSignature/PropertySimpleType.java");
        }
        
        @TestMetadata("compiler/testData/loadJava/kotlinSignature/error")
        public static class Error extends AbstractLoadJavaTest {
            @TestMetadata("AddingNullability.java")
            public void testAddingNullability() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/AddingNullability.java");
            }
            
            public void testAllFilesPresentInError() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/loadJava/kotlinSignature/error"), "java", true);
            }
            
            @TestMetadata("ExplicitFieldGettersAndSetters.java")
            public void testExplicitFieldGettersAndSetters() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/ExplicitFieldGettersAndSetters.java");
            }
            
            @TestMetadata("ExtraUpperBound.java")
            public void testExtraUpperBound() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/ExtraUpperBound.java");
            }
            
            @TestMetadata("MissingUpperBound.java")
            public void testMissingUpperBound() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/MissingUpperBound.java");
            }
            
            @TestMetadata("NoFieldTypeRef.java")
            public void testNoFieldTypeRef() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/NoFieldTypeRef.java");
            }
            
            @TestMetadata("NotVarargReplacedWithVararg.java")
            public void testNotVarargReplacedWithVararg() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/NotVarargReplacedWithVararg.java");
            }
            
            @TestMetadata("ReturnTypeMissing.java")
            public void testReturnTypeMissing() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/ReturnTypeMissing.java");
            }
            
            @TestMetadata("SyntaxError.java")
            public void testSyntaxError() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/SyntaxError.java");
            }
            
            @TestMetadata("SyntaxErrorInFieldAnnotation.java")
            public void testSyntaxErrorInFieldAnnotation() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/SyntaxErrorInFieldAnnotation.java");
            }
            
            @TestMetadata("VarargReplacedWithNotVararg.java")
            public void testVarargReplacedWithNotVararg() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/VarargReplacedWithNotVararg.java");
            }
            
            @TestMetadata("WrongFieldInitializer.java")
            public void testWrongFieldInitializer() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/WrongFieldInitializer.java");
            }
            
            @TestMetadata("WrongFieldMutability.java")
            public void testWrongFieldMutability() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/WrongFieldMutability.java");
            }
            
            @TestMetadata("WrongFieldName.java")
            public void testWrongFieldName() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/WrongFieldName.java");
            }
            
            @TestMetadata("WrongMethodName.java")
            public void testWrongMethodName() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/WrongMethodName.java");
            }
            
            @TestMetadata("WrongReturnTypeStructure.java")
            public void testWrongReturnTypeStructure() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/WrongReturnTypeStructure.java");
            }
            
            @TestMetadata("WrongTypeName1.java")
            public void testWrongTypeName1() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/WrongTypeName1.java");
            }
            
            @TestMetadata("WrongTypeName2.java")
            public void testWrongTypeName2() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/WrongTypeName2.java");
            }
            
            @TestMetadata("WrongTypeName3.java")
            public void testWrongTypeName3() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/WrongTypeName3.java");
            }
            
            @TestMetadata("WrongTypeParameterBoundStructure1.java")
            public void testWrongTypeParameterBoundStructure1() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/WrongTypeParameterBoundStructure1.java");
            }
            
            @TestMetadata("WrongTypeParameterBoundStructure2.java")
            public void testWrongTypeParameterBoundStructure2() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/WrongTypeParameterBoundStructure2.java");
            }
            
            @TestMetadata("WrongTypeParametersCount.java")
            public void testWrongTypeParametersCount() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/WrongTypeParametersCount.java");
            }
            
            @TestMetadata("WrongTypeVariance.java")
            public void testWrongTypeVariance() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/WrongTypeVariance.java");
            }
            
            @TestMetadata("WrongValueParameterStructure1.java")
            public void testWrongValueParameterStructure1() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/WrongValueParameterStructure1.java");
            }
            
            @TestMetadata("WrongValueParameterStructure2.java")
            public void testWrongValueParameterStructure2() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/WrongValueParameterStructure2.java");
            }
            
            @TestMetadata("WrongValueParametersCount.java")
            public void testWrongValueParametersCount() throws Exception {
                doTest("compiler/testData/loadJava/kotlinSignature/error/WrongValueParametersCount.java");
            }
            
        }
        
        @TestMetadata("compiler/testData/loadJava/kotlinSignature/propagation")
        @InnerTestClasses({Propagation.Return.class})
        public static class Propagation extends AbstractLoadJavaTest {
            public void testAllFilesPresentInPropagation() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/loadJava/kotlinSignature/propagation"), "java", true);
            }
            
            @TestMetadata("compiler/testData/loadJava/kotlinSignature/propagation/return")
            public static class Return extends AbstractLoadJavaTest {
                @TestMetadata("AddNotNullJavaSubtype.java")
                public void testAddNotNullJavaSubtype() throws Exception {
                    doTest("compiler/testData/loadJava/kotlinSignature/propagation/return/AddNotNullJavaSubtype.java");
                }
                
                @TestMetadata("AddNotNullSameJavaType.java")
                public void testAddNotNullSameJavaType() throws Exception {
                    doTest("compiler/testData/loadJava/kotlinSignature/propagation/return/AddNotNullSameJavaType.java");
                }
                
                @TestMetadata("AddNullabilityJavaSubtype.java")
                public void testAddNullabilityJavaSubtype() throws Exception {
                    doTest("compiler/testData/loadJava/kotlinSignature/propagation/return/AddNullabilityJavaSubtype.java");
                }
                
                @TestMetadata("AddNullabilitySameGenericType1.java")
                public void testAddNullabilitySameGenericType1() throws Exception {
                    doTest("compiler/testData/loadJava/kotlinSignature/propagation/return/AddNullabilitySameGenericType1.java");
                }
                
                @TestMetadata("AddNullabilitySameGenericType2.java")
                public void testAddNullabilitySameGenericType2() throws Exception {
                    doTest("compiler/testData/loadJava/kotlinSignature/propagation/return/AddNullabilitySameGenericType2.java");
                }
                
                @TestMetadata("AddNullabilitySameJavaType.java")
                public void testAddNullabilitySameJavaType() throws Exception {
                    doTest("compiler/testData/loadJava/kotlinSignature/propagation/return/AddNullabilitySameJavaType.java");
                }
                
                public void testAllFilesPresentInReturn() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/loadJava/kotlinSignature/propagation/return"), "java", true);
                }
                
                @TestMetadata("InheritNullabilityGenericSubclassSimple.java")
                public void testInheritNullabilityGenericSubclassSimple() throws Exception {
                    doTest("compiler/testData/loadJava/kotlinSignature/propagation/return/InheritNullabilityGenericSubclassSimple.java");
                }
                
                @TestMetadata("InheritNullabilityJavaSubtype.java")
                public void testInheritNullabilityJavaSubtype() throws Exception {
                    doTest("compiler/testData/loadJava/kotlinSignature/propagation/return/InheritNullabilityJavaSubtype.java");
                }
                
                @TestMetadata("InheritNullabilitySameGenericType.java")
                public void testInheritNullabilitySameGenericType() throws Exception {
                    doTest("compiler/testData/loadJava/kotlinSignature/propagation/return/InheritNullabilitySameGenericType.java");
                }
                
                @TestMetadata("InheritNullabilitySameJavaType.java")
                public void testInheritNullabilitySameJavaType() throws Exception {
                    doTest("compiler/testData/loadJava/kotlinSignature/propagation/return/InheritNullabilitySameJavaType.java");
                }
                
            }
            
            public static Test innerSuite() {
                TestSuite suite = new TestSuite("Propagation");
                suite.addTestSuite(Propagation.class);
                suite.addTestSuite(Return.class);
                return suite;
            }
        }
        
        public static Test innerSuite() {
            TestSuite suite = new TestSuite("KotlinSignature");
            suite.addTestSuite(KotlinSignature.class);
            suite.addTestSuite(Error.class);
            suite.addTest(Propagation.innerSuite());
            return suite;
        }
    }
    
    @TestMetadata("compiler/testData/loadJava/library")
    public static class Library extends AbstractLoadJavaTest {
        public void testAllFilesPresentInLibrary() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/loadJava/library"), "java", true);
        }
        
        @TestMetadata("LoadIterable.java")
        public void testLoadIterable() throws Exception {
            doTest("compiler/testData/loadJava/library/LoadIterable.java");
        }
        
        @TestMetadata("LoadIterator.java")
        public void testLoadIterator() throws Exception {
            doTest("compiler/testData/loadJava/library/LoadIterator.java");
        }
        
    }
    
    @TestMetadata("compiler/testData/loadJava/modality")
    public static class Modality extends AbstractLoadJavaTest {
        public void testAllFilesPresentInModality() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/loadJava/modality"), "java", true);
        }
        
        @TestMetadata("ModalityOfFakeOverrides.java")
        public void testModalityOfFakeOverrides() throws Exception {
            doTest("compiler/testData/loadJava/modality/ModalityOfFakeOverrides.java");
        }
        
    }
    
    @TestMetadata("compiler/testData/loadJava/notNull")
    public static class NotNull extends AbstractLoadJavaTest {
        public void testAllFilesPresentInNotNull() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/loadJava/notNull"), "java", true);
        }
        
        @TestMetadata("NotNullField.java")
        public void testNotNullField() throws Exception {
            doTest("compiler/testData/loadJava/notNull/NotNullField.java");
        }
        
        @TestMetadata("NotNullMethod.java")
        public void testNotNullMethod() throws Exception {
            doTest("compiler/testData/loadJava/notNull/NotNullMethod.java");
        }
        
        @TestMetadata("NotNullParameter.java")
        public void testNotNullParameter() throws Exception {
            doTest("compiler/testData/loadJava/notNull/NotNullParameter.java");
        }
        
    }
    
    @TestMetadata("compiler/testData/loadJava/vararg")
    public static class Vararg extends AbstractLoadJavaTest {
        public void testAllFilesPresentInVararg() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/loadJava/vararg"), "java", true);
        }
        
        @TestMetadata("VarargInt.java")
        public void testVarargInt() throws Exception {
            doTest("compiler/testData/loadJava/vararg/VarargInt.java");
        }
        
        @TestMetadata("VarargString.java")
        public void testVarargString() throws Exception {
            doTest("compiler/testData/loadJava/vararg/VarargString.java");
        }
        
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("LoadJavaTestGenerated");
        suite.addTestSuite(LoadJavaTestGenerated.class);
        suite.addTestSuite(Annotation.class);
        suite.addTestSuite(Constructor.class);
        suite.addTestSuite(JavaBean.class);
        suite.addTest(KotlinSignature.innerSuite());
        suite.addTestSuite(Library.class);
        suite.addTestSuite(Modality.class);
        suite.addTestSuite(NotNull.class);
        suite.addTestSuite(Vararg.class);
        return suite;
    }
}
