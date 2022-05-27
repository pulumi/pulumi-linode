module github.com/pulumi/pulumi-linode/provider/v3

go 1.16

require (
	github.com/hashicorp/terraform-plugin-sdk v1.11.0 // indirect
	github.com/linode/terraform-provider-linode v1.11.0
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.23.0
	github.com/pulumi/pulumi/sdk/v3 v3.31.1
)

replace (
	github.com/hashicorp/go-cty => github.com/hashicorp/go-cty v1.4.1-0.20200414143053-d3edf31b6320
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20220505215311-795430389fa7
	github.com/linode/terraform-provider-linode => github.com/pulumi/terraform-provider-linode v1.11.2-0.20220527170947-45f8ce0709f7
)
