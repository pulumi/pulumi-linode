// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetUsersUserDatabaseGrant;
import com.pulumi.linode.inputs.GetUsersUserDomainGrant;
import com.pulumi.linode.inputs.GetUsersUserFirewallGrant;
import com.pulumi.linode.inputs.GetUsersUserGlobalGrant;
import com.pulumi.linode.inputs.GetUsersUserImageGrant;
import com.pulumi.linode.inputs.GetUsersUserLinodeGrant;
import com.pulumi.linode.inputs.GetUsersUserLongviewGrant;
import com.pulumi.linode.inputs.GetUsersUserNodebalancerGrant;
import com.pulumi.linode.inputs.GetUsersUserPlacementGroupGrant;
import com.pulumi.linode.inputs.GetUsersUserStackscriptGrant;
import com.pulumi.linode.inputs.GetUsersUserVolumeGrant;
import com.pulumi.linode.inputs.GetUsersUserVpcGrant;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetUsersUser extends com.pulumi.resources.InvokeArgs {

    public static final GetUsersUser Empty = new GetUsersUser();

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="databaseGrants", required=true)
    private List<GetUsersUserDatabaseGrant> databaseGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public List<GetUsersUserDatabaseGrant> databaseGrants() {
        return this.databaseGrants;
    }

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="domainGrants", required=true)
    private List<GetUsersUserDomainGrant> domainGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public List<GetUsersUserDomainGrant> domainGrants() {
        return this.domainGrants;
    }

    /**
     * The email address for this User, for account management communications, and may be used for other communications as configured.
     * 
     */
    @Import(name="email", required=true)
    private String email;

    /**
     * @return The email address for this User, for account management communications, and may be used for other communications as configured.
     * 
     */
    public String email() {
        return this.email;
    }

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="firewallGrants", required=true)
    private List<GetUsersUserFirewallGrant> firewallGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public List<GetUsersUserFirewallGrant> firewallGrants() {
        return this.firewallGrants;
    }

    /**
     * A structure containing the Account-level grants a User has.
     * 
     */
    @Import(name="globalGrants", required=true)
    private List<GetUsersUserGlobalGrant> globalGrants;

    /**
     * @return A structure containing the Account-level grants a User has.
     * 
     */
    public List<GetUsersUserGlobalGrant> globalGrants() {
        return this.globalGrants;
    }

    /**
     * The ID of entity this grant applies to.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of entity this grant applies to.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="imageGrants", required=true)
    private List<GetUsersUserImageGrant> imageGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public List<GetUsersUserImageGrant> imageGrants() {
        return this.imageGrants;
    }

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="linodeGrants", required=true)
    private List<GetUsersUserLinodeGrant> linodeGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public List<GetUsersUserLinodeGrant> linodeGrants() {
        return this.linodeGrants;
    }

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="longviewGrants", required=true)
    private List<GetUsersUserLongviewGrant> longviewGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public List<GetUsersUserLongviewGrant> longviewGrants() {
        return this.longviewGrants;
    }

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="nodebalancerGrants", required=true)
    private List<GetUsersUserNodebalancerGrant> nodebalancerGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public List<GetUsersUserNodebalancerGrant> nodebalancerGrants() {
        return this.nodebalancerGrants;
    }

    /**
     * The date and time when this User’s current password was created. User passwords are first created during the Account sign-up process, and updated using the Reset Password webpage. null if this User has not created a password yet.
     * 
     */
    @Import(name="passwordCreated", required=true)
    private String passwordCreated;

    /**
     * @return The date and time when this User’s current password was created. User passwords are first created during the Account sign-up process, and updated using the Reset Password webpage. null if this User has not created a password yet.
     * 
     */
    public String passwordCreated() {
        return this.passwordCreated;
    }

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="placementGroupGrants", required=true)
    private List<GetUsersUserPlacementGroupGrant> placementGroupGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public List<GetUsersUserPlacementGroupGrant> placementGroupGrants() {
        return this.placementGroupGrants;
    }

    /**
     * If true, this User must be granted access to perform actions or access entities on this Account.
     * 
     */
    @Import(name="restricted", required=true)
    private Boolean restricted;

    /**
     * @return If true, this User must be granted access to perform actions or access entities on this Account.
     * 
     */
    public Boolean restricted() {
        return this.restricted;
    }

    /**
     * A list of SSH Key labels added by this User. These are the keys that will be deployed if this User is included in the authorized_users field of a create Linode, rebuild Linode, or create Disk request.
     * 
     */
    @Import(name="sshKeys", required=true)
    private List<String> sshKeys;

    /**
     * @return A list of SSH Key labels added by this User. These are the keys that will be deployed if this User is included in the authorized_users field of a create Linode, rebuild Linode, or create Disk request.
     * 
     */
    public List<String> sshKeys() {
        return this.sshKeys;
    }

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="stackscriptGrants", required=true)
    private List<GetUsersUserStackscriptGrant> stackscriptGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public List<GetUsersUserStackscriptGrant> stackscriptGrants() {
        return this.stackscriptGrants;
    }

    /**
     * A boolean value indicating if the User has Two Factor Authentication (TFA) enabled.
     * 
     */
    @Import(name="tfaEnabled", required=true)
    private Boolean tfaEnabled;

    /**
     * @return A boolean value indicating if the User has Two Factor Authentication (TFA) enabled.
     * 
     */
    public Boolean tfaEnabled() {
        return this.tfaEnabled;
    }

    /**
     * The type of this user.
     * 
     */
    @Import(name="userType", required=true)
    private String userType;

    /**
     * @return The type of this user.
     * 
     */
    public String userType() {
        return this.userType;
    }

    /**
     * This User&#39;s username. This is used for logging in, and may also be displayed alongside actions the User performs (for example, in Events or public StackScripts).
     * 
     */
    @Import(name="username", required=true)
    private String username;

    /**
     * @return This User&#39;s username. This is used for logging in, and may also be displayed alongside actions the User performs (for example, in Events or public StackScripts).
     * 
     */
    public String username() {
        return this.username;
    }

    /**
     * The phone number verified for this User Profile with the Phone Number Verify command. null if this User Profile has no verified phone number.
     * 
     */
    @Import(name="verifiedPhoneNumber", required=true)
    private String verifiedPhoneNumber;

    /**
     * @return The phone number verified for this User Profile with the Phone Number Verify command. null if this User Profile has no verified phone number.
     * 
     */
    public String verifiedPhoneNumber() {
        return this.verifiedPhoneNumber;
    }

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="volumeGrants", required=true)
    private List<GetUsersUserVolumeGrant> volumeGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public List<GetUsersUserVolumeGrant> volumeGrants() {
        return this.volumeGrants;
    }

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="vpcGrants", required=true)
    private List<GetUsersUserVpcGrant> vpcGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public List<GetUsersUserVpcGrant> vpcGrants() {
        return this.vpcGrants;
    }

    private GetUsersUser() {}

    private GetUsersUser(GetUsersUser $) {
        this.databaseGrants = $.databaseGrants;
        this.domainGrants = $.domainGrants;
        this.email = $.email;
        this.firewallGrants = $.firewallGrants;
        this.globalGrants = $.globalGrants;
        this.id = $.id;
        this.imageGrants = $.imageGrants;
        this.linodeGrants = $.linodeGrants;
        this.longviewGrants = $.longviewGrants;
        this.nodebalancerGrants = $.nodebalancerGrants;
        this.passwordCreated = $.passwordCreated;
        this.placementGroupGrants = $.placementGroupGrants;
        this.restricted = $.restricted;
        this.sshKeys = $.sshKeys;
        this.stackscriptGrants = $.stackscriptGrants;
        this.tfaEnabled = $.tfaEnabled;
        this.userType = $.userType;
        this.username = $.username;
        this.verifiedPhoneNumber = $.verifiedPhoneNumber;
        this.volumeGrants = $.volumeGrants;
        this.vpcGrants = $.vpcGrants;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUsersUser defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUsersUser $;

        public Builder() {
            $ = new GetUsersUser();
        }

        public Builder(GetUsersUser defaults) {
            $ = new GetUsersUser(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder databaseGrants(List<GetUsersUserDatabaseGrant> databaseGrants) {
            $.databaseGrants = databaseGrants;
            return this;
        }

        /**
         * @param databaseGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder databaseGrants(GetUsersUserDatabaseGrant... databaseGrants) {
            return databaseGrants(List.of(databaseGrants));
        }

        /**
         * @param domainGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder domainGrants(List<GetUsersUserDomainGrant> domainGrants) {
            $.domainGrants = domainGrants;
            return this;
        }

        /**
         * @param domainGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder domainGrants(GetUsersUserDomainGrant... domainGrants) {
            return domainGrants(List.of(domainGrants));
        }

        /**
         * @param email The email address for this User, for account management communications, and may be used for other communications as configured.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            $.email = email;
            return this;
        }

        /**
         * @param firewallGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder firewallGrants(List<GetUsersUserFirewallGrant> firewallGrants) {
            $.firewallGrants = firewallGrants;
            return this;
        }

        /**
         * @param firewallGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder firewallGrants(GetUsersUserFirewallGrant... firewallGrants) {
            return firewallGrants(List.of(firewallGrants));
        }

        /**
         * @param globalGrants A structure containing the Account-level grants a User has.
         * 
         * @return builder
         * 
         */
        public Builder globalGrants(List<GetUsersUserGlobalGrant> globalGrants) {
            $.globalGrants = globalGrants;
            return this;
        }

        /**
         * @param globalGrants A structure containing the Account-level grants a User has.
         * 
         * @return builder
         * 
         */
        public Builder globalGrants(GetUsersUserGlobalGrant... globalGrants) {
            return globalGrants(List.of(globalGrants));
        }

        /**
         * @param id The ID of entity this grant applies to.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param imageGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder imageGrants(List<GetUsersUserImageGrant> imageGrants) {
            $.imageGrants = imageGrants;
            return this;
        }

        /**
         * @param imageGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder imageGrants(GetUsersUserImageGrant... imageGrants) {
            return imageGrants(List.of(imageGrants));
        }

        /**
         * @param linodeGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder linodeGrants(List<GetUsersUserLinodeGrant> linodeGrants) {
            $.linodeGrants = linodeGrants;
            return this;
        }

        /**
         * @param linodeGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder linodeGrants(GetUsersUserLinodeGrant... linodeGrants) {
            return linodeGrants(List.of(linodeGrants));
        }

        /**
         * @param longviewGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder longviewGrants(List<GetUsersUserLongviewGrant> longviewGrants) {
            $.longviewGrants = longviewGrants;
            return this;
        }

        /**
         * @param longviewGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder longviewGrants(GetUsersUserLongviewGrant... longviewGrants) {
            return longviewGrants(List.of(longviewGrants));
        }

        /**
         * @param nodebalancerGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder nodebalancerGrants(List<GetUsersUserNodebalancerGrant> nodebalancerGrants) {
            $.nodebalancerGrants = nodebalancerGrants;
            return this;
        }

        /**
         * @param nodebalancerGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder nodebalancerGrants(GetUsersUserNodebalancerGrant... nodebalancerGrants) {
            return nodebalancerGrants(List.of(nodebalancerGrants));
        }

        /**
         * @param passwordCreated The date and time when this User’s current password was created. User passwords are first created during the Account sign-up process, and updated using the Reset Password webpage. null if this User has not created a password yet.
         * 
         * @return builder
         * 
         */
        public Builder passwordCreated(String passwordCreated) {
            $.passwordCreated = passwordCreated;
            return this;
        }

        /**
         * @param placementGroupGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder placementGroupGrants(List<GetUsersUserPlacementGroupGrant> placementGroupGrants) {
            $.placementGroupGrants = placementGroupGrants;
            return this;
        }

        /**
         * @param placementGroupGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder placementGroupGrants(GetUsersUserPlacementGroupGrant... placementGroupGrants) {
            return placementGroupGrants(List.of(placementGroupGrants));
        }

        /**
         * @param restricted If true, this User must be granted access to perform actions or access entities on this Account.
         * 
         * @return builder
         * 
         */
        public Builder restricted(Boolean restricted) {
            $.restricted = restricted;
            return this;
        }

        /**
         * @param sshKeys A list of SSH Key labels added by this User. These are the keys that will be deployed if this User is included in the authorized_users field of a create Linode, rebuild Linode, or create Disk request.
         * 
         * @return builder
         * 
         */
        public Builder sshKeys(List<String> sshKeys) {
            $.sshKeys = sshKeys;
            return this;
        }

        /**
         * @param sshKeys A list of SSH Key labels added by this User. These are the keys that will be deployed if this User is included in the authorized_users field of a create Linode, rebuild Linode, or create Disk request.
         * 
         * @return builder
         * 
         */
        public Builder sshKeys(String... sshKeys) {
            return sshKeys(List.of(sshKeys));
        }

        /**
         * @param stackscriptGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder stackscriptGrants(List<GetUsersUserStackscriptGrant> stackscriptGrants) {
            $.stackscriptGrants = stackscriptGrants;
            return this;
        }

        /**
         * @param stackscriptGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder stackscriptGrants(GetUsersUserStackscriptGrant... stackscriptGrants) {
            return stackscriptGrants(List.of(stackscriptGrants));
        }

        /**
         * @param tfaEnabled A boolean value indicating if the User has Two Factor Authentication (TFA) enabled.
         * 
         * @return builder
         * 
         */
        public Builder tfaEnabled(Boolean tfaEnabled) {
            $.tfaEnabled = tfaEnabled;
            return this;
        }

        /**
         * @param userType The type of this user.
         * 
         * @return builder
         * 
         */
        public Builder userType(String userType) {
            $.userType = userType;
            return this;
        }

        /**
         * @param username This User&#39;s username. This is used for logging in, and may also be displayed alongside actions the User performs (for example, in Events or public StackScripts).
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            $.username = username;
            return this;
        }

        /**
         * @param verifiedPhoneNumber The phone number verified for this User Profile with the Phone Number Verify command. null if this User Profile has no verified phone number.
         * 
         * @return builder
         * 
         */
        public Builder verifiedPhoneNumber(String verifiedPhoneNumber) {
            $.verifiedPhoneNumber = verifiedPhoneNumber;
            return this;
        }

        /**
         * @param volumeGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder volumeGrants(List<GetUsersUserVolumeGrant> volumeGrants) {
            $.volumeGrants = volumeGrants;
            return this;
        }

        /**
         * @param volumeGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder volumeGrants(GetUsersUserVolumeGrant... volumeGrants) {
            return volumeGrants(List.of(volumeGrants));
        }

        /**
         * @param vpcGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder vpcGrants(List<GetUsersUserVpcGrant> vpcGrants) {
            $.vpcGrants = vpcGrants;
            return this;
        }

        /**
         * @param vpcGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder vpcGrants(GetUsersUserVpcGrant... vpcGrants) {
            return vpcGrants(List.of(vpcGrants));
        }

        public GetUsersUser build() {
            if ($.databaseGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUser", "databaseGrants");
            }
            if ($.domainGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUser", "domainGrants");
            }
            if ($.email == null) {
                throw new MissingRequiredPropertyException("GetUsersUser", "email");
            }
            if ($.firewallGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUser", "firewallGrants");
            }
            if ($.globalGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUser", "globalGrants");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetUsersUser", "id");
            }
            if ($.imageGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUser", "imageGrants");
            }
            if ($.linodeGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUser", "linodeGrants");
            }
            if ($.longviewGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUser", "longviewGrants");
            }
            if ($.nodebalancerGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUser", "nodebalancerGrants");
            }
            if ($.passwordCreated == null) {
                throw new MissingRequiredPropertyException("GetUsersUser", "passwordCreated");
            }
            if ($.placementGroupGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUser", "placementGroupGrants");
            }
            if ($.restricted == null) {
                throw new MissingRequiredPropertyException("GetUsersUser", "restricted");
            }
            if ($.sshKeys == null) {
                throw new MissingRequiredPropertyException("GetUsersUser", "sshKeys");
            }
            if ($.stackscriptGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUser", "stackscriptGrants");
            }
            if ($.tfaEnabled == null) {
                throw new MissingRequiredPropertyException("GetUsersUser", "tfaEnabled");
            }
            if ($.userType == null) {
                throw new MissingRequiredPropertyException("GetUsersUser", "userType");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("GetUsersUser", "username");
            }
            if ($.verifiedPhoneNumber == null) {
                throw new MissingRequiredPropertyException("GetUsersUser", "verifiedPhoneNumber");
            }
            if ($.volumeGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUser", "volumeGrants");
            }
            if ($.vpcGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUser", "vpcGrants");
            }
            return $;
        }
    }

}
