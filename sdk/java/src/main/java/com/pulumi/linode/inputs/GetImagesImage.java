// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetImagesImage extends com.pulumi.resources.InvokeArgs {

    public static final GetImagesImage Empty = new GetImagesImage();

    @Import(name="capabilities", required=true)
    private List<String> capabilities;

    public List<String> capabilities() {
        return this.capabilities;
    }

    /**
     * When this Image was created.
     * 
     */
    @Import(name="created", required=true)
    private String created;

    /**
     * @return When this Image was created.
     * 
     */
    public String created() {
        return this.created;
    }

    /**
     * The name of the User who created this Image, or &#34;linode&#34; for official Images.
     * 
     */
    @Import(name="createdBy", required=true)
    private String createdBy;

    /**
     * @return The name of the User who created this Image, or &#34;linode&#34; for official Images.
     * 
     */
    public String createdBy() {
        return this.createdBy;
    }

    /**
     * Whether or not this Image is deprecated. Will only be true for deprecated public Images.
     * 
     */
    @Import(name="deprecated", required=true)
    private Boolean deprecated;

    /**
     * @return Whether or not this Image is deprecated. Will only be true for deprecated public Images.
     * 
     */
    public Boolean deprecated() {
        return this.deprecated;
    }

    /**
     * A detailed description of this Image.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    /**
     * @return A detailed description of this Image.
     * 
     */
    public String description() {
        return this.description;
    }

    @Import(name="expiry", required=true)
    private String expiry;

    public String expiry() {
        return this.expiry;
    }

    /**
     * The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * True if the Image is public.
     * 
     */
    @Import(name="isPublic", required=true)
    private Boolean isPublic;

    /**
     * @return True if the Image is public.
     * 
     */
    public Boolean isPublic() {
        return this.isPublic;
    }

    /**
     * A short description of the Image.
     * 
     */
    @Import(name="label", required=true)
    private String label;

    /**
     * @return A short description of the Image.
     * 
     */
    public String label() {
        return this.label;
    }

    /**
     * The minimum size this Image needs to deploy. Size is in MB. example: 2500
     * 
     */
    @Import(name="size", required=true)
    private Integer size;

    /**
     * @return The minimum size this Image needs to deploy. Size is in MB. example: 2500
     * 
     */
    public Integer size() {
        return this.size;
    }

    /**
     * The current status of this image. (`creating`, `pending_upload`, `available`)
     * 
     */
    @Import(name="status", required=true)
    private String status;

    /**
     * @return The current status of this image. (`creating`, `pending_upload`, `available`)
     * 
     */
    public String status() {
        return this.status;
    }

    /**
     * How the Image was created. Manual Images can be created at any time. &#34;Automatic&#34; Images are created automatically from a deleted Linode. (`manual`, `automatic`)
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return How the Image was created. Manual Images can be created at any time. &#34;Automatic&#34; Images are created automatically from a deleted Linode. (`manual`, `automatic`)
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * The upstream distribution vendor. `None` for private Images.
     * 
     */
    @Import(name="vendor", required=true)
    private String vendor;

    /**
     * @return The upstream distribution vendor. `None` for private Images.
     * 
     */
    public String vendor() {
        return this.vendor;
    }

    private GetImagesImage() {}

    private GetImagesImage(GetImagesImage $) {
        this.capabilities = $.capabilities;
        this.created = $.created;
        this.createdBy = $.createdBy;
        this.deprecated = $.deprecated;
        this.description = $.description;
        this.expiry = $.expiry;
        this.id = $.id;
        this.isPublic = $.isPublic;
        this.label = $.label;
        this.size = $.size;
        this.status = $.status;
        this.type = $.type;
        this.vendor = $.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagesImage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagesImage $;

        public Builder() {
            $ = new GetImagesImage();
        }

        public Builder(GetImagesImage defaults) {
            $ = new GetImagesImage(Objects.requireNonNull(defaults));
        }

        public Builder capabilities(List<String> capabilities) {
            $.capabilities = capabilities;
            return this;
        }

        public Builder capabilities(String... capabilities) {
            return capabilities(List.of(capabilities));
        }

        /**
         * @param created When this Image was created.
         * 
         * @return builder
         * 
         */
        public Builder created(String created) {
            $.created = created;
            return this;
        }

        /**
         * @param createdBy The name of the User who created this Image, or &#34;linode&#34; for official Images.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(String createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param deprecated Whether or not this Image is deprecated. Will only be true for deprecated public Images.
         * 
         * @return builder
         * 
         */
        public Builder deprecated(Boolean deprecated) {
            $.deprecated = deprecated;
            return this;
        }

        /**
         * @param description A detailed description of this Image.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            $.description = description;
            return this;
        }

        public Builder expiry(String expiry) {
            $.expiry = expiry;
            return this;
        }

        /**
         * @param id The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param isPublic True if the Image is public.
         * 
         * @return builder
         * 
         */
        public Builder isPublic(Boolean isPublic) {
            $.isPublic = isPublic;
            return this;
        }

        /**
         * @param label A short description of the Image.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            $.label = label;
            return this;
        }

        /**
         * @param size The minimum size this Image needs to deploy. Size is in MB. example: 2500
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            $.size = size;
            return this;
        }

        /**
         * @param status The current status of this image. (`creating`, `pending_upload`, `available`)
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            $.status = status;
            return this;
        }

        /**
         * @param type How the Image was created. Manual Images can be created at any time. &#34;Automatic&#34; Images are created automatically from a deleted Linode. (`manual`, `automatic`)
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param vendor The upstream distribution vendor. `None` for private Images.
         * 
         * @return builder
         * 
         */
        public Builder vendor(String vendor) {
            $.vendor = vendor;
            return this;
        }

        public GetImagesImage build() {
            $.capabilities = Objects.requireNonNull($.capabilities, "expected parameter 'capabilities' to be non-null");
            $.created = Objects.requireNonNull($.created, "expected parameter 'created' to be non-null");
            $.createdBy = Objects.requireNonNull($.createdBy, "expected parameter 'createdBy' to be non-null");
            $.deprecated = Objects.requireNonNull($.deprecated, "expected parameter 'deprecated' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.expiry = Objects.requireNonNull($.expiry, "expected parameter 'expiry' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.isPublic = Objects.requireNonNull($.isPublic, "expected parameter 'isPublic' to be non-null");
            $.label = Objects.requireNonNull($.label, "expected parameter 'label' to be non-null");
            $.size = Objects.requireNonNull($.size, "expected parameter 'size' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.vendor = Objects.requireNonNull($.vendor, "expected parameter 'vendor' to be non-null");
            return $;
        }
    }

}
