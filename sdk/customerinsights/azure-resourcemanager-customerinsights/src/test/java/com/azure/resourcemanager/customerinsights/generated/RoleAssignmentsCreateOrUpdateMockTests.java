// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.customerinsights.CustomerInsightsManager;
import com.azure.resourcemanager.customerinsights.models.AssignmentPrincipal;
import com.azure.resourcemanager.customerinsights.models.ResourceSetDescription;
import com.azure.resourcemanager.customerinsights.models.RoleAssignmentResourceFormat;
import com.azure.resourcemanager.customerinsights.models.RoleTypes;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class RoleAssignmentsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"tenantId\":\"hxxrqicf\",\"assignmentName\":\"vwjdthkvpy\",\"displayName\":{\"qup\":\"afinmp\"},\"description\":{\"xwhqdcclc\":\"rzfwkyluob\"},\"provisioningState\":\"Succeeded\",\"role\":\"ManageAdmin\",\"principals\":[{\"principalId\":\"p\",\"principalType\":\"ylcvwbzmfx\",\"principalMetadata\":{\"lpiywqnpfydrfbg\":\"mfj\",\"mq\":\"nyxbyxmk\"}},{\"principalId\":\"ncgaull\",\"principalType\":\"styygjq\",\"principalMetadata\":{\"qmiwxzfvvzucqfg\":\"mwqgmh\",\"kinh\":\"fjnbxwbmwd\"}},{\"principalId\":\"xhgdeke\",\"principalType\":\"zouyvewwpzrdwc\",\"principalMetadata\":{\"fhhhtestdq\":\"ohgcand\",\"vfkdxccyijji\":\"dnnckkpljdsh\",\"duydwnwgru\":\"hijzrqnjxmvv\",\"dym\":\"hqld\"}}],\"profiles\":{\"elements\":[\"i\",\"xqwqnghxnim\",\"yujrxgunnqgypuqt\",\"ylquevqmvyumgm\"],\"exceptions\":[\"bsnznwgsqufm\",\"xcyoseqcazisvb\"]},\"interactions\":{\"elements\":[\"yj\",\"gawepkwonrzp\",\"h\",\"rdtbgblxbuibrvj\"],\"exceptions\":[\"flvsmfjihv\"]},\"links\":{\"elements\":[\"rttjfuqmm\",\"j\",\"wfeqbavd\"],\"exceptions\":[\"wy\",\"ufmwelvx\"]},\"kpis\":{\"elements\":[\"kwdtlcj\"],\"exceptions\":[\"cqzvzrbvgwxhlxr\"]},\"sasPolicies\":{\"elements\":[\"drwynbgovazoym\",\"vhhplkhwwdk\"],\"exceptions\":[\"eqmgkcswz\",\"yxryearmhpwbuk\"]},\"connectors\":{\"elements\":[\"fasgtlvhqpo\",\"losjaemcez\",\"vftmh\",\"l\"],\"exceptions\":[\"jy\",\"hztmsm\",\"wtpcflcezswwvw\"]},\"views\":{\"elements\":[\"jtvbfp\",\"hruptsyq\"],\"exceptions\":[\"qswxdowumxquk\",\"cdio\",\"clqddnhfknebw\",\"ddpnyzcwyj\"]},\"relationshipLinks\":{\"elements\":[\"qldqabn\"],\"exceptions\":[\"aqbqxfbb\"]},\"relationships\":{\"elements\":[\"ddofxnfb\",\"jyyrqaedw\"],\"exceptions\":[\"cytjgoea\",\"okrwfmihw\",\"adhed\",\"fobdczvothm\"]},\"widgetTypes\":{\"elements\":[\"ozvbwfc\",\"jhbp\",\"elhscmyhrhjv\",\"zfq\"],\"exceptions\":[\"ndwpppqw\",\"joevzzuf\"]},\"roleAssignments\":{\"elements\":[\"mlynzlyvapbkr\",\"uog\"],\"exceptions\":[\"ltlcuhaizijva\",\"lz\"]},\"conflationPolicies\":{\"elements\":[\"psftqkrvmhvbvvc\",\"wtqsuspnhmzy\",\"ffetevrnt\"],\"exceptions\":[\"wacycsyotctkhf\",\"fsatvcsx\"]},\"segments\":{\"elements\":[\"mizhvprhqqw\",\"ublehhkplobz\"],\"exceptions\":[\"taksadzighmmt\"]}},\"id\":\"t\",\"name\":\"vucfvvraab\",\"type\":\"urdeewlsuxp\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CustomerInsightsManager manager = CustomerInsightsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        RoleAssignmentResourceFormat response = manager.roleAssignments()
            .define("cant")
            .withExistingHub("qtlfoz", "umrtgjqg")
            .withDisplayName(
                mapOf("te", "ofmex", "manydscdkxwdpw", "as", "tofelfhpfixo", "cbhaah", "ybsrwzzmrgtxdh", "kkzdfivsu"))
            .withDescription(mapOf("kesmkwtzgfragj", "pinmg", "qhvmmniiqy", "xerxlobkdb", "wlctmwp", "olhjnskbggicn",
                "gvxrktjcjigc", "lxkrk"))
            .withRole(RoleTypes.ADMIN)
            .withPrincipals(Arrays.asList(
                new AssignmentPrincipal().withPrincipalId("nbqx")
                    .withPrincipalType("sevchefpg")
                    .withPrincipalMetadata(mapOf("ruholae", "yy")),
                new AssignmentPrincipal().withPrincipalId("wcgi")
                    .withPrincipalType("mrimaabsqql")
                    .withPrincipalMetadata(mapOf("ow", "z"))))
            .withProfiles(
                new ResourceSetDescription().withElements(Arrays.asList("kmbj", "mihrijezbfsj", "fczglkvbg", "kbsvbwy"))
                    .withExceptions(Arrays.asList("gnbknhj", "clxaxw", "ffaspsdzkucsz", "hdoaqipmnx")))
            .withInteractions(new ResourceSetDescription().withElements(Arrays.asList("sbzrnmuv", "vp", "ofddtbfmek"))
                .withExceptions(Arrays.asList("ginxdvmaoy")))
            .withLinks(new ResourceSetDescription().withElements(Arrays.asList("gyxzmxynofxl"))
                .withExceptions(Arrays.asList("oqxt", "nzujsji", "krpskcjhmm")))
            .withKpis(new ResourceSetDescription().withElements(Arrays.asList("ivd", "tkykpaxnlsfgnys", "accptbzetxy"))
                .withExceptions(Arrays.asList("iceecvjwy")))
            .withSasPolicies(new ResourceSetDescription()
                .withElements(Arrays.asList("xmpzzwahd", "dvhaztkxbiv", "fgxmbr", "gmwibiosiqsykqf"))
                .withExceptions(Arrays.asList("drtx", "fdaglmrcokzzert", "ounzsiywh", "bym")))
            .withConnectors(new ResourceSetDescription().withElements(Arrays.asList("ikze", "qnnfywt"))
                .withExceptions(Arrays.asList("w")))
            .withViews(new ResourceSetDescription().withElements(Arrays.asList("hczygpmg", "jculojhhylx"))
                .withExceptions(Arrays.asList("fiyymotuzb", "bwjmtftcveln")))
            .withRelationshipLinks(new ResourceSetDescription().withElements(Arrays.asList("kqnstpaqpibjgbvs"))
                .withExceptions(Arrays.asList("hfxrt", "xbmsennqfabqc", "malec", "cxs")))
            .withRelationships(new ResourceSetDescription().withElements(Arrays.asList("dxmsynbkdnn", "ufxuzmsvzyqrbr"))
                .withExceptions(Arrays.asList("jtlxfikjkxara")))
            .withWidgetTypes(new ResourceSetDescription()
                .withElements(Arrays.asList("asnjeglht", "xbozpcjcnwjz", "qblxrnwvds", "oq"))
                .withExceptions(Arrays.asList("wwsdsorgfhjxsa")))
            .withRoleAssignments(new ResourceSetDescription().withElements(Arrays.asList("uffhxf"))
                .withExceptions(Arrays.asList("wzrdqyoybm", "n", "to")))
            .withConflationPolicies(new ResourceSetDescription().withElements(Arrays.asList("daiovrbhr", "qphkv"))
                .withExceptions(Arrays.asList("adcrxyl", "yp", "tyzvelffohu")))
            .withSegments(new ResourceSetDescription()
                .withElements(Arrays.asList("jdfrwpsshrmnkccl", "c", "uogkscxjfsgm", "spoebnx"))
                .withExceptions(Arrays.asList("owscuyfqlamfbq", "sujkafuzpnxqp", "n")))
            .create();

        Assertions.assertEquals("afinmp", response.displayName().get("qup"));
        Assertions.assertEquals("rzfwkyluob", response.description().get("xwhqdcclc"));
        Assertions.assertEquals(RoleTypes.MANAGE_ADMIN, response.role());
        Assertions.assertEquals("p", response.principals().get(0).principalId());
        Assertions.assertEquals("ylcvwbzmfx", response.principals().get(0).principalType());
        Assertions.assertEquals("mfj", response.principals().get(0).principalMetadata().get("lpiywqnpfydrfbg"));
        Assertions.assertEquals("i", response.profiles().elements().get(0));
        Assertions.assertEquals("bsnznwgsqufm", response.profiles().exceptions().get(0));
        Assertions.assertEquals("yj", response.interactions().elements().get(0));
        Assertions.assertEquals("flvsmfjihv", response.interactions().exceptions().get(0));
        Assertions.assertEquals("rttjfuqmm", response.links().elements().get(0));
        Assertions.assertEquals("wy", response.links().exceptions().get(0));
        Assertions.assertEquals("kwdtlcj", response.kpis().elements().get(0));
        Assertions.assertEquals("cqzvzrbvgwxhlxr", response.kpis().exceptions().get(0));
        Assertions.assertEquals("drwynbgovazoym", response.sasPolicies().elements().get(0));
        Assertions.assertEquals("eqmgkcswz", response.sasPolicies().exceptions().get(0));
        Assertions.assertEquals("fasgtlvhqpo", response.connectors().elements().get(0));
        Assertions.assertEquals("jy", response.connectors().exceptions().get(0));
        Assertions.assertEquals("jtvbfp", response.views().elements().get(0));
        Assertions.assertEquals("qswxdowumxquk", response.views().exceptions().get(0));
        Assertions.assertEquals("qldqabn", response.relationshipLinks().elements().get(0));
        Assertions.assertEquals("aqbqxfbb", response.relationshipLinks().exceptions().get(0));
        Assertions.assertEquals("ddofxnfb", response.relationships().elements().get(0));
        Assertions.assertEquals("cytjgoea", response.relationships().exceptions().get(0));
        Assertions.assertEquals("ozvbwfc", response.widgetTypes().elements().get(0));
        Assertions.assertEquals("ndwpppqw", response.widgetTypes().exceptions().get(0));
        Assertions.assertEquals("mlynzlyvapbkr", response.roleAssignments().elements().get(0));
        Assertions.assertEquals("ltlcuhaizijva", response.roleAssignments().exceptions().get(0));
        Assertions.assertEquals("psftqkrvmhvbvvc", response.conflationPolicies().elements().get(0));
        Assertions.assertEquals("wacycsyotctkhf", response.conflationPolicies().exceptions().get(0));
        Assertions.assertEquals("mizhvprhqqw", response.segments().elements().get(0));
        Assertions.assertEquals("taksadzighmmt", response.segments().exceptions().get(0));
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
