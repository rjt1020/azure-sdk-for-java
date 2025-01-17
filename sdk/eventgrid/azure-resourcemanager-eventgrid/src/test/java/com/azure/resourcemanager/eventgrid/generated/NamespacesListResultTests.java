// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.NamespaceInner;
import com.azure.resourcemanager.eventgrid.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.eventgrid.models.AlternativeAuthenticationNameSource;
import com.azure.resourcemanager.eventgrid.models.ClientAuthenticationSettings;
import com.azure.resourcemanager.eventgrid.models.DynamicRoutingEnrichment;
import com.azure.resourcemanager.eventgrid.models.IdentityInfo;
import com.azure.resourcemanager.eventgrid.models.IdentityType;
import com.azure.resourcemanager.eventgrid.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.models.IpActionType;
import com.azure.resourcemanager.eventgrid.models.NamespaceSku;
import com.azure.resourcemanager.eventgrid.models.NamespacesListResult;
import com.azure.resourcemanager.eventgrid.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.models.RoutingEnrichments;
import com.azure.resourcemanager.eventgrid.models.RoutingIdentityInfo;
import com.azure.resourcemanager.eventgrid.models.RoutingIdentityType;
import com.azure.resourcemanager.eventgrid.models.SkuName;
import com.azure.resourcemanager.eventgrid.models.StaticRoutingEnrichment;
import com.azure.resourcemanager.eventgrid.models.TlsVersion;
import com.azure.resourcemanager.eventgrid.models.TopicSpacesConfiguration;
import com.azure.resourcemanager.eventgrid.models.TopicSpacesConfigurationState;
import com.azure.resourcemanager.eventgrid.models.TopicsConfiguration;
import com.azure.resourcemanager.eventgrid.models.UserIdentityProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class NamespacesListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NamespacesListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"privateEndpointConnections\":[{\"properties\":{},\"id\":\"bibgjmfxumv\",\"name\":\"cluyovwxnbkf\",\"type\":\"zzxscyhwzdgiruj\"}],\"provisioningState\":\"Failed\",\"topicsConfiguration\":{\"hostname\":\"vzzbtdcq\"},\"topicSpacesConfiguration\":{\"state\":\"Enabled\",\"routeTopicResourceId\":\"ujviylwdshfs\",\"hostname\":\"rbgyefry\",\"routingEnrichments\":{\"static\":[{\"valueType\":\"StaticRoutingEnrichment\"},{\"valueType\":\"StaticRoutingEnrichment\"}],\"dynamic\":[{}]},\"clientAuthentication\":{\"alternativeAuthenticationNameSources\":[\"ClientCertificateSubject\",\"ClientCertificateSubject\"]},\"maximumSessionExpiryInHours\":689928385,\"maximumClientSessionsPerAuthenticationName\":700953056,\"routingIdentityInfo\":{\"type\":\"None\",\"userAssignedIdentity\":\"ctymoxoftp\"}},\"isZoneRedundant\":false,\"publicNetworkAccess\":\"Enabled\",\"inboundIpRules\":[{\"ipMask\":\"hxacpqjlihhyu\",\"action\":\"Allow\"}],\"minimumTlsVersionAllowed\":\"1.1\"},\"sku\":{\"name\":\"Standard\",\"capacity\":2091231398},\"identity\":{\"type\":\"SystemAssigned, UserAssigned\",\"principalId\":\"zxulucvpamrsreu\",\"tenantId\":\"xurisjnhnyt\",\"userAssignedIdentities\":{\"uutpwoqhih\":{\"principalId\":\"jzgxmrhublwp\",\"clientId\":\"sutrgjup\"}}},\"location\":\"qg\",\"tags\":{\"cypsxjv\":\"nfqn\",\"zjxvydfcea\":\"oimwkslirc\",\"gdyftumrtwna\":\"vlhv\"},\"id\":\"jslb\",\"name\":\"wkojgcyztsfmzn\",\"type\":\"aeqphchqnr\"},{\"properties\":{\"privateEndpointConnections\":[{\"properties\":{},\"id\":\"huwrykqgaifm\",\"name\":\"iklbydvkhb\",\"type\":\"jdz\"}],\"provisioningState\":\"Updating\",\"topicsConfiguration\":{\"hostname\":\"srhnjivo\"},\"topicSpacesConfiguration\":{\"state\":\"Disabled\",\"routeTopicResourceId\":\"v\",\"hostname\":\"zgemjdftuljlt\",\"routingEnrichments\":{\"static\":[{\"valueType\":\"StaticRoutingEnrichment\"},{\"valueType\":\"StaticRoutingEnrichment\"}],\"dynamic\":[{},{},{}]},\"clientAuthentication\":{\"alternativeAuthenticationNameSources\":[\"ClientCertificateEmail\"]},\"maximumSessionExpiryInHours\":11700249,\"maximumClientSessionsPerAuthenticationName\":289279485,\"routingIdentityInfo\":{\"type\":\"UserAssigned\",\"userAssignedIdentity\":\"wqiok\"}},\"isZoneRedundant\":false,\"publicNetworkAccess\":\"Disabled\",\"inboundIpRules\":[{\"ipMask\":\"sv\",\"action\":\"Allow\"},{\"ipMask\":\"rvkwc\",\"action\":\"Allow\"}],\"minimumTlsVersionAllowed\":\"1.0\"},\"sku\":{\"name\":\"Standard\",\"capacity\":1494813827},\"identity\":{\"type\":\"SystemAssigned\",\"principalId\":\"dbsdshm\",\"tenantId\":\"maehvbbxurip\",\"userAssignedIdentities\":{\"wrck\":{\"principalId\":\"htba\",\"clientId\":\"gx\"},\"uudl\":{\"principalId\":\"kl\",\"clientId\":\"pluodpv\"},\"lhpl\":{\"principalId\":\"ibthostgktstvd\",\"clientId\":\"clzedqbcvh\"}}},\"location\":\"qkdlw\",\"tags\":{\"kxtrq\":\"bum\",\"rtawcoezb\":\"fsmlmbtxhwgfw\"},\"id\":\"hubskhudygooo\",\"name\":\"kqfqjbvl\",\"type\":\"orfmluiqt\"},{\"properties\":{\"privateEndpointConnections\":[{\"properties\":{},\"id\":\"yvnqqybaryeuay\",\"name\":\"kq\",\"type\":\"bqgzslesjcbhern\"},{\"properties\":{},\"id\":\"iew\",\"name\":\"jcvb\",\"type\":\"uwrbehwagoh\"},{\"properties\":{},\"id\":\"f\",\"name\":\"kmr\",\"type\":\"emvvhm\"}],\"provisioningState\":\"Updating\",\"topicsConfiguration\":{\"hostname\":\"futacoebjvewzc\"},\"topicSpacesConfiguration\":{\"state\":\"Disabled\",\"routeTopicResourceId\":\"cpmguaadraufact\",\"hostname\":\"hzovaj\",\"routingEnrichments\":{\"static\":[{\"valueType\":\"StaticRoutingEnrichment\"},{\"valueType\":\"StaticRoutingEnrichment\"}],\"dynamic\":[{}]},\"clientAuthentication\":{\"alternativeAuthenticationNameSources\":[\"ClientCertificateEmail\",\"ClientCertificateEmail\"]},\"maximumSessionExpiryInHours\":1193345721,\"maximumClientSessionsPerAuthenticationName\":693666625,\"routingIdentityInfo\":{\"type\":\"SystemAssigned\",\"userAssignedIdentity\":\"qubkw\"}},\"isZoneRedundant\":false,\"publicNetworkAccess\":\"Disabled\",\"inboundIpRules\":[{\"ipMask\":\"tujbazpju\",\"action\":\"Allow\"},{\"ipMask\":\"nyfln\",\"action\":\"Allow\"}],\"minimumTlsVersionAllowed\":\"1.0\"},\"sku\":{\"name\":\"Standard\",\"capacity\":1908961214},\"identity\":{\"type\":\"UserAssigned\",\"principalId\":\"mygdxpgpqch\",\"tenantId\":\"zepn\",\"userAssignedIdentities\":{\"kokwbqplhlvnu\":{\"principalId\":\"rxgibbd\",\"clientId\":\"confozauors\"},\"vmnnrw\":{\"principalId\":\"pzlrphw\",\"clientId\":\"oldweyuqdu\"},\"v\":{\"principalId\":\"i\",\"clientId\":\"ktalywjhhgdnhxms\"},\"jchvcyy\":{\"principalId\":\"miloxggdufiqndie\",\"clientId\":\"ao\"}}},\"location\":\"fgdo\",\"tags\":{\"oqonma\":\"biipuip\",\"cimpevfg\":\"jeknizshq\",\"rrilbywdxsmic\":\"b\",\"qujizdvo\":\"wrwfscjfnyns\"},\"id\":\"ytibyow\",\"name\":\"blgyavutpthj\",\"type\":\"xoi\"},{\"properties\":{\"privateEndpointConnections\":[{\"properties\":{},\"id\":\"bpimlqoljxkcgxxl\",\"name\":\"sffgcvizqzd\",\"type\":\"l\"},{\"properties\":{},\"id\":\"lyoupfgfbkju\",\"name\":\"dyhgkfminsg\",\"type\":\"wzf\"},{\"properties\":{},\"id\":\"sttktlahbqa\",\"name\":\"tx\",\"type\":\"gzukxitmm\"}],\"provisioningState\":\"Succeeded\",\"topicsConfiguration\":{\"hostname\":\"q\"},\"topicSpacesConfiguration\":{\"state\":\"Disabled\",\"routeTopicResourceId\":\"rxcpjuisavo\",\"hostname\":\"dzf\",\"routingEnrichments\":{\"static\":[{\"valueType\":\"StaticRoutingEnrichment\"},{\"valueType\":\"StaticRoutingEnrichment\"},{\"valueType\":\"StaticRoutingEnrichment\"},{\"valueType\":\"StaticRoutingEnrichment\"}],\"dynamic\":[{},{}]},\"clientAuthentication\":{\"alternativeAuthenticationNameSources\":[\"ClientCertificateDns\",\"ClientCertificateDns\",\"ClientCertificateIp\",\"ClientCertificateDns\"]},\"maximumSessionExpiryInHours\":213163160,\"maximumClientSessionsPerAuthenticationName\":2078837978,\"routingIdentityInfo\":{\"type\":\"SystemAssigned\",\"userAssignedIdentity\":\"xyiopidkqqfku\"}},\"isZoneRedundant\":true,\"publicNetworkAccess\":\"SecuredByPerimeter\",\"inboundIpRules\":[{\"ipMask\":\"igovi\",\"action\":\"Allow\"},{\"ipMask\":\"pmloazuruoc\",\"action\":\"Allow\"}],\"minimumTlsVersionAllowed\":\"1.1\"},\"sku\":{\"name\":\"Standard\",\"capacity\":1838309541},\"identity\":{\"type\":\"None\",\"principalId\":\"xakvvjgslor\",\"tenantId\":\"lmywwtkgkxnyed\",\"userAssignedIdentities\":{\"bvpa\":{\"principalId\":\"vudtjuewbcihx\",\"clientId\":\"whcjyxcc\"},\"stcyohpfkyrkdbd\":{\"principalId\":\"kkudzp\",\"clientId\":\"wjplma\"},\"cegfnmntfp\":{\"principalId\":\"ogsjkmnwqjno\",\"clientId\":\"iyhddvi\"}}},\"location\":\"memfnczdwvvbalxl\",\"tags\":{\"rdnhfuku\":\"hpodbzev\"},\"id\":\"sjcswsmystuluqyp\",\"name\":\"cvlerchpqbmfpjba\",\"type\":\"widf\"}],\"nextLink\":\"sspuunnoxyhkx\"}")
            .toObject(NamespacesListResult.class);
        Assertions.assertEquals("qg", model.value().get(0).location());
        Assertions.assertEquals("nfqn", model.value().get(0).tags().get("cypsxjv"));
        Assertions.assertEquals(SkuName.STANDARD, model.value().get(0).sku().name());
        Assertions.assertEquals(2091231398, model.value().get(0).sku().capacity());
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("zxulucvpamrsreu", model.value().get(0).identity().principalId());
        Assertions.assertEquals("xurisjnhnyt", model.value().get(0).identity().tenantId());
        Assertions.assertEquals("jzgxmrhublwp",
            model.value().get(0).identity().userAssignedIdentities().get("uutpwoqhih").principalId());
        Assertions.assertEquals("sutrgjup",
            model.value().get(0).identity().userAssignedIdentities().get("uutpwoqhih").clientId());
        Assertions.assertEquals(TopicSpacesConfigurationState.ENABLED,
            model.value().get(0).topicSpacesConfiguration().state());
        Assertions.assertEquals("ujviylwdshfs", model.value().get(0).topicSpacesConfiguration().routeTopicResourceId());
        Assertions.assertEquals(AlternativeAuthenticationNameSource.CLIENT_CERTIFICATE_SUBJECT, model.value().get(0)
            .topicSpacesConfiguration().clientAuthentication().alternativeAuthenticationNameSources().get(0));
        Assertions.assertEquals(689928385,
            model.value().get(0).topicSpacesConfiguration().maximumSessionExpiryInHours());
        Assertions.assertEquals(700953056,
            model.value().get(0).topicSpacesConfiguration().maximumClientSessionsPerAuthenticationName());
        Assertions.assertEquals(RoutingIdentityType.NONE,
            model.value().get(0).topicSpacesConfiguration().routingIdentityInfo().type());
        Assertions.assertEquals("ctymoxoftp",
            model.value().get(0).topicSpacesConfiguration().routingIdentityInfo().userAssignedIdentity());
        Assertions.assertEquals(false, model.value().get(0).isZoneRedundant());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.value().get(0).publicNetworkAccess());
        Assertions.assertEquals("hxacpqjlihhyu", model.value().get(0).inboundIpRules().get(0).ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, model.value().get(0).inboundIpRules().get(0).action());
        Assertions.assertEquals(TlsVersion.ONE_ONE, model.value().get(0).minimumTlsVersionAllowed());
        Assertions.assertEquals("sspuunnoxyhkx", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NamespacesListResult model
            = new NamespacesListResult()
                .withValue(Arrays.asList(
                    new NamespaceInner().withLocation("qg")
                        .withTags(mapOf("cypsxjv", "nfqn", "zjxvydfcea", "oimwkslirc", "gdyftumrtwna", "vlhv"))
                        .withSku(new NamespaceSku().withName(SkuName.STANDARD).withCapacity(2091231398))
                        .withIdentity(
                            new IdentityInfo().withType(IdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                                .withPrincipalId("zxulucvpamrsreu").withTenantId("xurisjnhnyt")
                                .withUserAssignedIdentities(mapOf(
                                    "uutpwoqhih",
                                    new UserIdentityProperties().withPrincipalId("jzgxmrhublwp")
                                        .withClientId("sutrgjup"))))
                        .withPrivateEndpointConnections(Arrays.asList(new PrivateEndpointConnectionInner()))
                        .withTopicsConfiguration(new TopicsConfiguration())
                        .withTopicSpacesConfiguration(new TopicSpacesConfiguration()
                            .withState(TopicSpacesConfigurationState.ENABLED).withRouteTopicResourceId("ujviylwdshfs")
                            .withRoutingEnrichments(new RoutingEnrichments()
                                .withStaticProperty(
                                    Arrays.asList(new StaticRoutingEnrichment(), new StaticRoutingEnrichment()))
                                .withDynamic(Arrays.asList(new DynamicRoutingEnrichment())))
                            .withClientAuthentication(
                                new ClientAuthenticationSettings().withAlternativeAuthenticationNameSources(
                                    Arrays.asList(AlternativeAuthenticationNameSource.CLIENT_CERTIFICATE_SUBJECT,
                                        AlternativeAuthenticationNameSource.CLIENT_CERTIFICATE_SUBJECT)))
                            .withMaximumSessionExpiryInHours(689928385)
                            .withMaximumClientSessionsPerAuthenticationName(700953056)
                            .withRoutingIdentityInfo(new RoutingIdentityInfo().withType(RoutingIdentityType.NONE)
                                .withUserAssignedIdentity("ctymoxoftp")))
                        .withIsZoneRedundant(false).withPublicNetworkAccess(PublicNetworkAccess.ENABLED)
                        .withInboundIpRules(Arrays
                            .asList(new InboundIpRule().withIpMask("hxacpqjlihhyu").withAction(IpActionType.ALLOW)))
                        .withMinimumTlsVersionAllowed(TlsVersion.ONE_ONE),
                    new NamespaceInner().withLocation("qkdlw")
                        .withTags(mapOf("kxtrq", "bum", "rtawcoezb", "fsmlmbtxhwgfw"))
                        .withSku(new NamespaceSku().withName(SkuName.STANDARD).withCapacity(1494813827))
                        .withIdentity(new IdentityInfo().withType(IdentityType.SYSTEM_ASSIGNED)
                            .withPrincipalId("dbsdshm").withTenantId("maehvbbxurip")
                            .withUserAssignedIdentities(mapOf("wrck",
                                new UserIdentityProperties().withPrincipalId("htba").withClientId("gx"), "uudl",
                                new UserIdentityProperties().withPrincipalId("kl")
                                    .withClientId("pluodpv"),
                                "lhpl", new UserIdentityProperties().withPrincipalId("ibthostgktstvd")
                                    .withClientId("clzedqbcvh"))))
                        .withPrivateEndpointConnections(Arrays.asList(new PrivateEndpointConnectionInner()))
                        .withTopicsConfiguration(new TopicsConfiguration())
                        .withTopicSpacesConfiguration(new TopicSpacesConfiguration()
                            .withState(TopicSpacesConfigurationState.DISABLED).withRouteTopicResourceId("v")
                            .withRoutingEnrichments(new RoutingEnrichments()
                                .withStaticProperty(
                                    Arrays.asList(new StaticRoutingEnrichment(), new StaticRoutingEnrichment()))
                                .withDynamic(Arrays.asList(new DynamicRoutingEnrichment(),
                                    new DynamicRoutingEnrichment(), new DynamicRoutingEnrichment())))
                            .withClientAuthentication(
                                new ClientAuthenticationSettings().withAlternativeAuthenticationNameSources(
                                    Arrays.asList(AlternativeAuthenticationNameSource.CLIENT_CERTIFICATE_EMAIL)))
                            .withMaximumSessionExpiryInHours(11700249)
                            .withMaximumClientSessionsPerAuthenticationName(289279485)
                            .withRoutingIdentityInfo(new RoutingIdentityInfo()
                                .withType(RoutingIdentityType.USER_ASSIGNED).withUserAssignedIdentity("wqiok")))
                        .withIsZoneRedundant(false).withPublicNetworkAccess(PublicNetworkAccess.DISABLED)
                        .withInboundIpRules(
                            Arrays.asList(new InboundIpRule().withIpMask("sv").withAction(IpActionType.ALLOW),
                                new InboundIpRule().withIpMask("rvkwc").withAction(IpActionType.ALLOW)))
                        .withMinimumTlsVersionAllowed(TlsVersion.ONE_ZERO),
                    new NamespaceInner().withLocation("fgdo")
                        .withTags(mapOf("oqonma", "biipuip", "cimpevfg", "jeknizshq", "rrilbywdxsmic", "b", "qujizdvo",
                            "wrwfscjfnyns"))
                        .withSku(new NamespaceSku().withName(SkuName.STANDARD).withCapacity(1908961214))
                        .withIdentity(new IdentityInfo().withType(IdentityType.USER_ASSIGNED)
                            .withPrincipalId("mygdxpgpqch").withTenantId("zepn")
                            .withUserAssignedIdentities(mapOf("kokwbqplhlvnu",
                                new UserIdentityProperties().withPrincipalId("rxgibbd").withClientId("confozauors"),
                                "vmnnrw",
                                new UserIdentityProperties().withPrincipalId("pzlrphw").withClientId("oldweyuqdu"), "v",
                                new UserIdentityProperties().withPrincipalId("i").withClientId("ktalywjhhgdnhxms"),
                                "jchvcyy",
                                new UserIdentityProperties().withPrincipalId("miloxggdufiqndie").withClientId("ao"))))
                        .withPrivateEndpointConnections(Arrays.asList(new PrivateEndpointConnectionInner(),
                            new PrivateEndpointConnectionInner(), new PrivateEndpointConnectionInner()))
                        .withTopicsConfiguration(new TopicsConfiguration())
                        .withTopicSpacesConfiguration(
                            new TopicSpacesConfiguration().withState(TopicSpacesConfigurationState.DISABLED)
                                .withRouteTopicResourceId("cpmguaadraufact")
                                .withRoutingEnrichments(new RoutingEnrichments()
                                    .withStaticProperty(
                                        Arrays.asList(new StaticRoutingEnrichment(), new StaticRoutingEnrichment()))
                                    .withDynamic(Arrays.asList(new DynamicRoutingEnrichment())))
                                .withClientAuthentication(
                                    new ClientAuthenticationSettings().withAlternativeAuthenticationNameSources(
                                        Arrays.asList(AlternativeAuthenticationNameSource.CLIENT_CERTIFICATE_EMAIL,
                                            AlternativeAuthenticationNameSource.CLIENT_CERTIFICATE_EMAIL)))
                                .withMaximumSessionExpiryInHours(1193345721)
                                .withMaximumClientSessionsPerAuthenticationName(693666625)
                                .withRoutingIdentityInfo(new RoutingIdentityInfo()
                                    .withType(RoutingIdentityType.SYSTEM_ASSIGNED).withUserAssignedIdentity("qubkw")))
                        .withIsZoneRedundant(false).withPublicNetworkAccess(PublicNetworkAccess.DISABLED)
                        .withInboundIpRules(
                            Arrays.asList(new InboundIpRule().withIpMask("tujbazpju").withAction(IpActionType.ALLOW),
                                new InboundIpRule().withIpMask("nyfln").withAction(IpActionType.ALLOW)))
                        .withMinimumTlsVersionAllowed(TlsVersion.ONE_ZERO),
                    new NamespaceInner().withLocation("memfnczdwvvbalxl").withTags(mapOf("rdnhfuku", "hpodbzev"))
                        .withSku(new NamespaceSku().withName(SkuName.STANDARD).withCapacity(1838309541))
                        .withIdentity(new IdentityInfo().withType(IdentityType.NONE).withPrincipalId("xakvvjgslor")
                            .withTenantId("lmywwtkgkxnyed")
                            .withUserAssignedIdentities(mapOf("bvpa",
                                new UserIdentityProperties().withPrincipalId("vudtjuewbcihx").withClientId("whcjyxcc"),
                                "stcyohpfkyrkdbd",
                                new UserIdentityProperties().withPrincipalId("kkudzp").withClientId("wjplma"),
                                "cegfnmntfp",
                                new UserIdentityProperties().withPrincipalId("ogsjkmnwqjno").withClientId("iyhddvi"))))
                        .withPrivateEndpointConnections(Arrays.asList(new PrivateEndpointConnectionInner(),
                            new PrivateEndpointConnectionInner(), new PrivateEndpointConnectionInner()))
                        .withTopicsConfiguration(new TopicsConfiguration())
                        .withTopicSpacesConfiguration(new TopicSpacesConfiguration()
                            .withState(TopicSpacesConfigurationState.DISABLED).withRouteTopicResourceId("rxcpjuisavo")
                            .withRoutingEnrichments(new RoutingEnrichments()
                                .withStaticProperty(
                                    Arrays.asList(new StaticRoutingEnrichment(), new StaticRoutingEnrichment(),
                                        new StaticRoutingEnrichment(), new StaticRoutingEnrichment()))
                                .withDynamic(
                                    Arrays.asList(new DynamicRoutingEnrichment(), new DynamicRoutingEnrichment())))
                            .withClientAuthentication(
                                new ClientAuthenticationSettings().withAlternativeAuthenticationNameSources(
                                    Arrays.asList(AlternativeAuthenticationNameSource.CLIENT_CERTIFICATE_DNS,
                                        AlternativeAuthenticationNameSource.CLIENT_CERTIFICATE_DNS,
                                        AlternativeAuthenticationNameSource.CLIENT_CERTIFICATE_IP,
                                        AlternativeAuthenticationNameSource.CLIENT_CERTIFICATE_DNS)))
                            .withMaximumSessionExpiryInHours(213163160)
                            .withMaximumClientSessionsPerAuthenticationName(2078837978).withRoutingIdentityInfo(
                                new RoutingIdentityInfo().withType(RoutingIdentityType.SYSTEM_ASSIGNED)
                                    .withUserAssignedIdentity("xyiopidkqqfku")))
                        .withIsZoneRedundant(true).withPublicNetworkAccess(PublicNetworkAccess.SECURED_BY_PERIMETER)
                        .withInboundIpRules(
                            Arrays.asList(new InboundIpRule().withIpMask("igovi").withAction(IpActionType.ALLOW),
                                new InboundIpRule().withIpMask("pmloazuruoc").withAction(IpActionType.ALLOW)))
                        .withMinimumTlsVersionAllowed(TlsVersion.ONE_ONE)))
                .withNextLink("sspuunnoxyhkx");
        model = BinaryData.fromObject(model).toObject(NamespacesListResult.class);
        Assertions.assertEquals("qg", model.value().get(0).location());
        Assertions.assertEquals("nfqn", model.value().get(0).tags().get("cypsxjv"));
        Assertions.assertEquals(SkuName.STANDARD, model.value().get(0).sku().name());
        Assertions.assertEquals(2091231398, model.value().get(0).sku().capacity());
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("zxulucvpamrsreu", model.value().get(0).identity().principalId());
        Assertions.assertEquals("xurisjnhnyt", model.value().get(0).identity().tenantId());
        Assertions.assertEquals("jzgxmrhublwp",
            model.value().get(0).identity().userAssignedIdentities().get("uutpwoqhih").principalId());
        Assertions.assertEquals("sutrgjup",
            model.value().get(0).identity().userAssignedIdentities().get("uutpwoqhih").clientId());
        Assertions.assertEquals(TopicSpacesConfigurationState.ENABLED,
            model.value().get(0).topicSpacesConfiguration().state());
        Assertions.assertEquals("ujviylwdshfs", model.value().get(0).topicSpacesConfiguration().routeTopicResourceId());
        Assertions.assertEquals(AlternativeAuthenticationNameSource.CLIENT_CERTIFICATE_SUBJECT, model.value().get(0)
            .topicSpacesConfiguration().clientAuthentication().alternativeAuthenticationNameSources().get(0));
        Assertions.assertEquals(689928385,
            model.value().get(0).topicSpacesConfiguration().maximumSessionExpiryInHours());
        Assertions.assertEquals(700953056,
            model.value().get(0).topicSpacesConfiguration().maximumClientSessionsPerAuthenticationName());
        Assertions.assertEquals(RoutingIdentityType.NONE,
            model.value().get(0).topicSpacesConfiguration().routingIdentityInfo().type());
        Assertions.assertEquals("ctymoxoftp",
            model.value().get(0).topicSpacesConfiguration().routingIdentityInfo().userAssignedIdentity());
        Assertions.assertEquals(false, model.value().get(0).isZoneRedundant());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.value().get(0).publicNetworkAccess());
        Assertions.assertEquals("hxacpqjlihhyu", model.value().get(0).inboundIpRules().get(0).ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, model.value().get(0).inboundIpRules().get(0).action());
        Assertions.assertEquals(TlsVersion.ONE_ONE, model.value().get(0).minimumTlsVersionAllowed());
        Assertions.assertEquals("sspuunnoxyhkx", model.nextLink());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
